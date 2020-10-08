package tech.gamedev.freefit.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_remaining_workout.view.*
import kotlinx.android.synthetic.main.item_workout.view.ivWorkoutItem
import kotlinx.android.synthetic.main.item_workout.view.tvItemWorkout
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.workouts.Workouts

class ShowRemainingExercisesAdapter :
    RecyclerView.Adapter<ShowRemainingExercisesAdapter.WorkoutViewHolder>() {

    inner class WorkoutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        return WorkoutViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_remaining_workout,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        val workout = Workouts.getShortWorkoutList()[position]
        holder.itemView.apply {
            Glide.with(this).load(workout.getImage()).into(ivWorkoutItem)
            tvItemWorkout.text = workout.getName()


            if (workout.getIsSelected()) {
                clItemBackground.background =
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.item_circular_thin_color_accent_border
                    )

            } else if (workout.getIsCompleted()) {
                clItemBackground.background =
                    ContextCompat.getDrawable(context, R.drawable.item_circular_color_accent_bg)

            } else {
                clItemBackground.background =
                    ContextCompat.getDrawable(context, R.drawable.item_circular_color_grey_bg)

            }
        }


    }

    override fun getItemCount(): Int {
        return Workouts.getShortWorkoutList().size
    }
}