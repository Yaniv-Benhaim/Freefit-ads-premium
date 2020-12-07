package tech.gamedev.freefit.ui.adapters

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_video_view.view.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.Workout
import tech.gamedev.freefit.ui.fragments.workoutfragments.shortworkoutpro.WorkoutViewFragment

class ViewPagerAdapter(
    val workouts: List<Workout>,
    val context: Context,
    private val listener: OnItemClickListener
) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {


    val listOfExercises = ArrayList<Workout>(workouts)
    var player: MediaPlayer? = null

    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        init {
            itemView.btnFinishWorkoutVP.setOnClickListener(this)

            itemView.ivBtnCancelWorkout.setOnClickListener {
                WorkoutViewFragment.customDialogForBackBtn(itemView)
            }
        }

        override fun onClick(v: View?) {

            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                val workout: Workout = listOfExercises[position]
                listener.addWorkoutToDatabase(workout)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_video_view, parent, false
        )
        return ViewPagerViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {

        val workout = listOfExercises[position]



        if (position == listOfExercises.size - 1) {

            holder.itemView.apply {
                clFinishedWorkout.visibility = View.VISIBLE
                if (clFinishedWorkout.visibility == View.VISIBLE) {

                }

            }


        } else {
            holder.itemView.tvCurrentExerciseAmount.text = workout.getAmount()
            holder.itemView.tvCurrentExerciseName.text = workout.getName()


            if (position < listOfExercises.size - 1) {
                val nextWorkout = listOfExercises[position + 1]
                holder.itemView.ivNextExerciseFinal.setImageResource(nextWorkout.getImage())
                holder.itemView.tvNextExerciseFinal.text =
                    "${nextWorkout.getAmount()} ${nextWorkout.getName()}"
                holder.itemView.progressBarFinal.progress = position
            }
        }


        val uri: Uri = Uri.parse(workout.getVideo())
        holder.itemView.vvViewPager.setVideoURI(uri)
        holder.itemView.vvViewPager.start()
        holder.itemView.vvViewPager.setOnPreparedListener {
            it.setVolume(0f, 0f)
            it.isLooping = true


        }
    }

    override fun getItemCount(): Int {
        return listOfExercises.size
    }

    interface OnItemClickListener {
        fun addWorkoutToDatabase(workout: Workout)
    }


}