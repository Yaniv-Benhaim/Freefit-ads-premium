package tech.gamedev.freefit.ui.fragments.workoutfragments.prometheus

import android.app.Dialog
import android.media.MediaPlayer
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.dialog_custom_back_confirmation.*
import kotlinx.android.synthetic.main.fragment_workout_view.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.Workout
import tech.gamedev.freefit.data.db.workoutdata.workouts.Workouts
import tech.gamedev.freefit.ui.adapters.ViewPagerAdapter
import tech.gamedev.freefit.ui.fragments.mainviewmodel.MainViewModel
import java.util.*

@AndroidEntryPoint
class PrometheusWorkoutViewFragment : Fragment(R.layout.fragment_workout_view),
    ViewPagerAdapter.OnItemClickListener {

    private val viewModel: MainViewModel by viewModels()
    var player: MediaPlayer? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewPager()
        startTimer()


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                customDialogForBackBtn(view)
            }
        })
    }

    private fun setViewPager() {
        var adapter = ViewPagerAdapter(
            Workouts.getPrometheusWorkout(),
            requireContext(),
            this@PrometheusWorkoutViewFragment
        )
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

    override fun addWorkoutToDatabase(workout: Workout) {
        val newWorkout = workout
        newWorkout.setTimeStamp(Calendar.getInstance().timeInMillis)
        viewModel.insertWorkout(workout)
        Toast.makeText(
            requireContext(),
            "Workout saved in your history: ${workout.getName()}",
            Toast.LENGTH_SHORT
        ).show()
        findNavController().navigate(R.id.action_global_featuredFragment)
    }


    companion object {
        fun customDialogForBackBtn(view: View?) {
            val dialog = Dialog(view!!.context)
            dialog.setContentView(R.layout.dialog_custom_back_confirmation)
            dialog.tvYes.setOnClickListener {
                findNavController(view).navigate(R.id.action_global_featuredFragment)
                dialog.dismiss()
            }
            dialog.tvNo.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }


    }

    override fun onResume() {
        super.onResume()
        setViewPager()
    }


}