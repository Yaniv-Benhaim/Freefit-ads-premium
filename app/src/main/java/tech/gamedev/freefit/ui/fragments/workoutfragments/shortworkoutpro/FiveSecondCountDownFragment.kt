package tech.gamedev.freefit.ui.fragments.workoutfragments.shortworkoutpro

import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_five_second_count_down.*
import tech.gamedev.freefit.R


class FiveSecondCountDownFragment : Fragment(R.layout.fragment_five_second_count_down) {

    val handler: Handler? = null
    var player: MediaPlayer? = null


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
                }

            }

            override fun onFinish() {

                player = null
                findNavController().navigate(R.id.action_fiveSecondCountDownFragment_to_workoutViewFragment)
            }
        }
        timer.start()

    }

}