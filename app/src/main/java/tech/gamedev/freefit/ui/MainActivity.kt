package tech.gamedev.freefit.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.other.Constants.ACTION_SHOW_TRACKING_FRAGMENT


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val acct = GoogleSignIn.getLastSignedInAccount(this)
        if (acct != null) {
            personName = acct.displayName
            personGivenName = acct.givenName
            personEmail = acct.email
            personId = acct.id
            personPhoto = acct.photoUrl
        }*/



        navigateToTrackingFragmentIfNeeded(intent)

        //SETTING UP TOP AND BOTTOM TOOLBAR
        /*setSupportActionBar(toolbar)*/
        bottomNavigationView.setupWithNavController(navHostFragment.findNavController())
        bottomNavigationView.setOnNavigationItemReselectedListener {/* NO-OP */ }

        navHostFragment.findNavController()
            .addOnDestinationChangedListener { _, destination, _ ->
                when (destination.id) {
                    R.id.settingsFragment, R.id.featuredFragment, R.id.statisticsFragment, R.id.storeFragment, R.id.historyFragment ->
                        bottomNavigationView.visibility = View.VISIBLE
                    else -> bottomNavigationView.visibility = View.GONE
                }
            }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        navigateToTrackingFragmentIfNeeded(intent)
    }

    private fun navigateToTrackingFragmentIfNeeded(intent: Intent?) {
        if (intent?.action == ACTION_SHOW_TRACKING_FRAGMENT) {
            navHostFragment.findNavController().navigate(R.id.action_global_trackingFragment)
        }
    }

    companion object {
        var personName: String? = null
        var personGivenName: String? = null
        var personId: String? = null
        var personPhoto: Uri? = null
        var personEmail: String? = null

    }
}