package tech.gamedev.freefit.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_history.view.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.Workout
import java.text.SimpleDateFormat
import java.util.*

class HistoryAdapter(val workouts: List<Workout>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    inner class HistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_history,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {

        //TODO: IMPLEMENT DELETE HISTORY ITEM BUTTON
        val workout = workouts[position]
        holder.itemView.apply {

            /*ivHistoryWorkoutImage.setImageResource(workout.getImg())*/

            tvHistoryWorkoutTitle.text = workout.getName()

            when (workout.getName()) {
                "Short Workout" -> {
                    tvHistoryAvgCaloriesBurned.text =
                        context.getString(R.string.shortworkout_calories_burned)
                    tvTotalWorkoutsCompleted.text =
                        context.getString(R.string.short_workout_total_exercises)
                    tvMuscleGroupsTrained.text =
                        context.getString(R.string.short_workout_muscle_group)
                }
                "Athena Workout" -> {
                    tvHistoryAvgCaloriesBurned.text =
                        context.getString(R.string.athena_workout_calories_burned)
                    tvTotalWorkoutsCompleted.text =
                        context.getString(R.string.ahtena_workout_total_exercises)
                    tvMuscleGroupsTrained.text =
                        context.getString(R.string.athena_workout_muscle_group)
                }
                "Morpheus Workout" -> {
                    tvHistoryAvgCaloriesBurned.text =
                        context.getString(R.string.morpheus_workout_calories_burned)
                    tvTotalWorkoutsCompleted.text =
                        context.getString(R.string.morpheus_workout_total_exercises)
                    tvMuscleGroupsTrained.text =
                        context.getString(R.string.morpheus_workout_muscle_group)
                }
                "Prometheus Workout" -> {
                    tvHistoryAvgCaloriesBurned.text =
                        context.getString(R.string.prometheus_workout_calories_burned)
                    tvTotalWorkoutsCompleted.text =
                        context.getString(R.string.prometheus_workout_total_exercises)
                    tvMuscleGroupsTrained.text =
                        context.getString(R.string.prometheus_workout_muscle_group)
                }
            }

            val calendar = Calendar.getInstance().apply {
                timeInMillis = workout.getTimeStamp()
            }

            val dateFormat = SimpleDateFormat("dd.MM.yy", Locale.getDefault())

            tvHistoryWorkoutDate.text = dateFormat.format(calendar.time)
        }

    }

    override fun getItemCount(): Int {
        return workouts.size
    }
}