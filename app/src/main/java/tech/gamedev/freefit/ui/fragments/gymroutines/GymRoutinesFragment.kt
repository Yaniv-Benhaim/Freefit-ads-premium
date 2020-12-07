package tech.gamedev.freefit.ui.fragments.gymroutines

import android.os.Bundle
import android.transition.Slide
import android.transition.Transition
import android.transition.TransitionManager
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_gym_routines.*
import tech.gamedev.freefit.R


class GymRoutinesFragment : Fragment(R.layout.fragment_gym_routines) {

    private var is2DayCollapsed = true
    private var is3DayCollapsed = true
    private var is5DayCollapsed = true
    private var is6DayCollapsed = true


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        ivBtn2DayCollapse.setOnClickListener {
            if (is2DayCollapsed) {

                val transition: Transition = Slide(Gravity.END)
                transition.duration = 400
                transition.addTarget(R.id.cl2DayCollapsedView)

                TransitionManager.beginDelayedTransition(view as ViewGroup?, transition)
                cl2DayCollapsedView.visibility = View.VISIBLE
                is2DayCollapsed = false
            } else {
                val transition: Transition = Slide(Gravity.END)
                transition.duration = 400
                transition.addTarget(R.id.cl2DayCollapsedView)

                TransitionManager.beginDelayedTransition(view as ViewGroup?, transition)
                cl2DayCollapsedView.visibility = View.GONE
                is2DayCollapsed = true
            }
        }

        ivBtn3DayCollapse.setOnClickListener {
            if (is3DayCollapsed) {
                val transition: Transition = Slide(Gravity.END)
                transition.duration = 400
                transition.addTarget(R.id.cl3DayCollapsedView)

                TransitionManager.beginDelayedTransition(view as ViewGroup?, transition)
                cl3DayCollapsedView.visibility = View.VISIBLE
                is3DayCollapsed = false
            } else {
                val transition: Transition = Slide(Gravity.END)
                transition.duration = 400
                transition.addTarget(R.id.cl3DayCollapsedView)

                TransitionManager.beginDelayedTransition(view as ViewGroup?, transition)
                cl3DayCollapsedView.visibility = View.GONE
                is3DayCollapsed = true
            }
        }

        ivBtn5DayCollapse.setOnClickListener {
            if (is5DayCollapsed) {
                val transition: Transition = Slide(Gravity.END)
                transition.duration = 400
                transition.addTarget(R.id.cl5DayCollapsedView)

                TransitionManager.beginDelayedTransition(view as ViewGroup?, transition)
                cl5DayCollapsedView.visibility = View.VISIBLE
                is5DayCollapsed = false
            } else {
                val transition: Transition = Slide(Gravity.END)
                transition.duration = 400
                transition.addTarget(R.id.cl5DayCollapsedView)

                TransitionManager.beginDelayedTransition(view as ViewGroup?, transition)
                cl5DayCollapsedView.visibility = View.GONE
                is5DayCollapsed = true
            }
        }

        ivBtn6DayCollapse.setOnClickListener {
            if (is6DayCollapsed) {
                val transition: Transition = Slide(Gravity.END)
                transition.duration = 400
                transition.addTarget(R.id.cl6DayCollapsedView)

                TransitionManager.beginDelayedTransition(view as ViewGroup?, transition)
                cl6DayCollapsedView.visibility = View.VISIBLE
                is6DayCollapsed = false
            } else {
                val transition: Transition = Slide(Gravity.END)
                transition.duration = 400
                transition.addTarget(R.id.cl6DayCollapsedView)

                TransitionManager.beginDelayedTransition(view as ViewGroup?, transition)
                cl6DayCollapsedView.visibility = View.GONE
                is6DayCollapsed = true
            }
        }
    }

}