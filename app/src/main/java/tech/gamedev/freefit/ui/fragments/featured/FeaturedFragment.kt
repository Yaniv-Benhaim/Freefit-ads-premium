package tech.gamedev.freefit.ui.fragments.featured

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.featured_fragment.*
import tech.gamedev.freefit.R

class FeaturedFragment : Fragment(R.layout.featured_fragment) {

    private val viewModel: FeaturedViewModel by this.viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clShortWorkoutBtn.setOnClickListener {
            findNavController().navigate(R.id.action_featuredFragment_to_shortWorkoutFragment)
        }

        clSprintsAndRuns.setOnClickListener {
            findNavController().navigate(R.id.action_featuredFragment_to_setupFragment)
        }
    }

}