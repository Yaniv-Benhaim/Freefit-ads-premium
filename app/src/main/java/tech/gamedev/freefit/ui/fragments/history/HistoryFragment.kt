package tech.gamedev.freefit.ui.fragments.history

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.history_fragment.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.ui.adapters.HistoryAdapter
import tech.gamedev.freefit.ui.fragments.mainviewmodel.MainViewModel

@AndroidEntryPoint
class HistoryFragment : Fragment(R.layout.history_fragment) {

    val mainViewModel: MainViewModel by viewModels()

    lateinit var historyAdapter: HistoryAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setupRecyclerView()
    }

    private fun setupRecyclerView() = rvHistory.apply {
        mainViewModel.workouts.observe(viewLifecycleOwner, Observer {
            historyAdapter = HistoryAdapter(it)
            adapter = historyAdapter
            layoutManager = LinearLayoutManager(requireContext())
        })

    }


}