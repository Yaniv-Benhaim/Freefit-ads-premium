package tech.gamedev.freefit.ui.fragments.login

import android.content.ContentValues.TAG
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.navigation.fragment.findNavController
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_login.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.other.Constants.AUTH_REQUEST_CODE
import tech.gamedev.freefit.ui.MainActivity
import tech.gamedev.freefit.ui.fragments.mainviewmodel.MainViewModel


@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {

    val mainViewModel: MainViewModel by viewModels()
    private var user: FirebaseUser? = null
    private var userMutableLiveData: MutableLiveData<FirebaseUser?>? = null
    private var mMediaPlayer: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setBackGroundVideo()

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        val mGoogleSignInClient = GoogleSignIn.getClient(requireActivity(), gso)



        btnGoToLogin.setOnClickListener {
            llLoginContainer.visibility = View.GONE
            llRegisterContainer.visibility = View.GONE

            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, AUTH_REQUEST_CODE)

        }



        btnGoToRegister.setOnClickListener {
            llRegisterContainer.visibility = View.GONE
            llLoginContainer.visibility = View.GONE
        }

        btn_start.setOnClickListener {
            findNavController().navigate(R.id.action_global_featuredFragment)
        }

    }


    override fun onStart() {
        super.onStart()


    }

    private fun logon() {


        /*   var providers = arrayListOf(
             AuthUI.IdpConfig.EmailBuilder().build(),
               AuthUI.IdpConfig.GoogleBuilder().build()
           )
           startActivityForResult(
               AuthUI.getInstance()
                   .createSignInIntentBuilder()
                   .setAvailableProviders(providers)
                   .build(),AUTH_REQUEST_CODE
           )*/
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == AUTH_REQUEST_CODE) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)

            // Signed in successfully, show authenticated UI.
            updateUI(account)
            Toast.makeText(context, "Welcome ${account?.displayName}", Toast.LENGTH_SHORT).show()
        } catch (e: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w(TAG, "signInResult:failed code=" + e.statusCode)
            updateUI(null)
            Toast.makeText(context, "Login Failed please try again", Toast.LENGTH_SHORT).show()
        }


    }

    private fun updateUI(acct: GoogleSignInAccount?) {
        if (acct != null) {
            MainActivity.personName = acct.displayName
            MainActivity.personGivenName = acct.givenName
            MainActivity.personEmail = acct.email
            MainActivity.personId = acct.id
            MainActivity.personPhoto = acct.photoUrl
            Toast.makeText(requireContext(), MainActivity.personEmail, Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_global_featuredFragment)
        } else {
            Toast.makeText(
                requireContext(),
                "Login was not successful, please try again",
                Toast.LENGTH_SHORT
            ).show()
        }


    }

    private fun setBackGroundVideo() {

        val uri: Uri =
            Uri.parse("android.resource://" + (activity?.packageName) + "/" + R.raw.fitbg)

        vv_background.setVideoURI(uri)
        vv_background.start()
        vv_background.setOnPreparedListener(MediaPlayer.OnPreparedListener {

            mMediaPlayer = it
            mMediaPlayer!!.isLooping = true
            mMediaPlayer!!.setVolume(0f, 0f)

            val videoRatio = mMediaPlayer!!.videoWidth / mMediaPlayer!!.videoHeight.toFloat()
            val screenRatio = vv_background.width / vv_background.height.toFloat()
            val scaleX = videoRatio / screenRatio
            if (scaleX >= 1f) {
                vv_background.scaleX = scaleX
            } else {
                vv_background.scaleY = 1f / scaleX
            }
        }
        )
    }


}