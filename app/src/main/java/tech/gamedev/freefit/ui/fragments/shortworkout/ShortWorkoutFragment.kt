package tech.gamedev.freefit.ui.fragments.shortworkout

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.short_workout_fragment.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.ui.adapters.WorkoutAdapter


class ShortWorkoutFragment : Fragment(R.layout.short_workout_fragment) {

    /* private val viewModel : ShortWorkoutViewModel by viewModels()*/

    private lateinit var workoutAdapter: WorkoutAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()

        btnStartShortWorkout.setOnClickListener {
            findNavController().navigate(R.id.action_shortWorkoutFragment_to_fiveSecondCountDownFragment)
        }
    }

    private fun setupRecyclerView() = rvShortWorkout.apply {
        workoutAdapter = WorkoutAdapter()
        adapter = workoutAdapter
        layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

}