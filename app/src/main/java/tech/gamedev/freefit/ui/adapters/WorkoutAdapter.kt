package tech.gamedev.freefit.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_workout.view.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.workouts.Workouts

class WorkoutAdapter : RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>() {

    inner class WorkoutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        return WorkoutViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_workout,
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


        }


    }

    override fun getItemCount(): Int {
        return Workouts.getShortWorkoutList().size
    }


}