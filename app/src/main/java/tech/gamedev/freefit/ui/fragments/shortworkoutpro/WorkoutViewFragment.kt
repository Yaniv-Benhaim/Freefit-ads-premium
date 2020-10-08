package tech.gamedev.freefit.ui.fragments.shortworkoutpro

import android.media.MediaPlayer
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_workout_view.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.workouts.Workouts
import tech.gamedev.freefit.ui.adapters.ViewPagerAdapter


class WorkoutViewFragment : Fragment(R.layout.fragment_workout_view) {

    var player: MediaPlayer? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewPager()
        startTimer()


    }

    private fun setViewPager() {
        var adapter = ViewPagerAdapter(Workouts.getShortWorkoutList(), requireContext())
        viewPager.adapter = adapter
        viewPager.offscreenPageLimit = Workouts.getShortWorkoutList().size - 1
        viewPager.clipToPadding = true
        viewPager.clipChildren = true


    }


    val stoptime: Long = 0

    private fun startTimer() {

        chStopWatch.base = SystemClock.elapsedRealtime() + stoptime
        chStopWatch.start()
    }


}