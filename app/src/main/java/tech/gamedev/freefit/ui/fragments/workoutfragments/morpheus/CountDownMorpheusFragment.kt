package tech.gamedev.freefit.ui.fragments.workoutfragments.morpheus

import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_five_second_count_down.*
import tech.gamedev.freefit.R


class CountDownMorpheusFragment : Fragment(R.layout.fragment_five_second_count_down) {

    val handler: Handler? = null
    var player: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                player?.stop()
                findNavController().navigate(R.id.action_global_featuredFragment)
            }
        })
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        player = MediaPlayer.create(requireContext(), R.raw.countdown_go)
        player!!.start()

        val timer = object : CountDownTimer(6000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

                if (millisUntilFinished / 1000 != 0L) {
                    tvCountDownTimer.text = (millisUntilFinished / 1000).toString()
                } else {
                    tvCountDownTimer.text = "GO"

                    if (tvCountDownTimer != null) {
                        findNavController().navigate(R.id.action_countDownMorpheusFragment_to_morpheusWorkoutViewFragment)
                    }
                }

            }

            override fun onFinish() {


            }
        }
        timer.start()

    }

}