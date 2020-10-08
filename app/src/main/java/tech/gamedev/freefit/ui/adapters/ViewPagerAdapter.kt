package tech.gamedev.freefit.ui.adapters

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_video_view.view.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.Workout

class ViewPagerAdapter(val workouts: List<Workout>, val context: Context) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {


    val listOfExercises = ArrayList<Workout>(workouts)
    var player: MediaPlayer? = null

    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

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



                btnResumeWorkout.setOnClickListener {

                }

                btnFinishWorkoutVP.setOnClickListener {

                    //Playing sound when finishing exercise
                    player = MediaPlayer.create(context, R.raw.applause)
                    player!!.start()

                    val timer = object : CountDownTimer(3000, 1000) {
                        override fun onTick(millisUntilFinished: Long) {


                        }

                        override fun onFinish() {
                            player?.stop()
                            findNavController().navigate(R.id.action_global_featuredFragment)
                        }

                    }.start()
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


}