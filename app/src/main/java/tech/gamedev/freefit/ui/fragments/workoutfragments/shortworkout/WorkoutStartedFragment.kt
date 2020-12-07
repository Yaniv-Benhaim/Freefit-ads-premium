package tech.gamedev.freefit.ui.fragments.workoutfragments.shortworkout

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_workout_started.*
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.Workout
import tech.gamedev.freefit.data.db.workoutdata.workouts.Workouts
import tech.gamedev.freefit.ui.adapters.ShowRemainingExercisesAdapter


class WorkoutStartedFragment : Fragment(R.layout.fragment_workout_started) {

    private var restTimer: CountDownTimer? = null
    private var restProgress = 0

    private var exerciseTimer: CountDownTimer? = null
    private var exerciseProgress = 0

    private var workoutList: ArrayList<Workout>? = null
    private var currentExercisePosition = -1

    private var player: MediaPlayer? = null

    private var exerciseStatusAdapter: ShowRemainingExercisesAdapter? = null

    var mMediaPlayer: MediaPlayer? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setWorkoutList()
        setupRestView()
        setupRecyclerView()
    }

    private fun setWorkoutList() {
        workoutList = Workouts.getShortWorkoutList()
    }

    private fun setRestProgressBar() {

        progressBar.progress = restProgress // Sets the current progress to the specified value.

        restTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                restProgress++
                progressBar.progress = 10 - restProgress // Indicates progress bar progress
                tvTimer.text =
                    (10 - restProgress).toString()  // Current progress is set to text view in terms of seconds.

            }

            override fun onFinish() {
                //Increasing the exercisePosition within the array of Exercises
                currentExercisePosition++
                setExerciseView()

                workoutList!![currentExercisePosition].setIsSelected(true)
                exerciseStatusAdapter!!.notifyDataSetChanged()
            }
        }.start()

    }

    private fun setupRestView() {
        //Setting mediaplayer back to null

        mMediaPlayer?.stop()
        mMediaPlayer = null
        vvVideo.visibility = View.GONE
        setExerciseVideo()

        //Playing sound when finishing exercise
        /*player = MediaPlayer.create(applicationContext, R.raw.press_start)
        player!!.start()*/


        ll_exerciseView.visibility = View.INVISIBLE
        ll_restView.visibility = View.VISIBLE




        if (restTimer != null) {
            restTimer!!.cancel()
            restProgress = 0
        }

        //Showing next exercise in textView of the restView
        tvNextExercise.text = workoutList!![currentExercisePosition + 1].getName()
        // This function is used to set the progress details.
        setRestProgressBar()
    }


    private fun setExerciseProgressBar() {

        progressBar2.progress = exerciseProgress

        exerciseTimer = object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                exerciseProgress++
                progressBar2.progress = 60 - exerciseProgress
                tvTimer2.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                if (currentExercisePosition < workoutList!!.size - 1) {
                    workoutList!![currentExercisePosition].setIsSelected(false)
                    workoutList!![currentExercisePosition].setIsCompleted(true)
                    exerciseStatusAdapter!!.notifyDataSetChanged()

                    setupRestView()
                } else {

                    findNavController().navigate(R.id.action_workoutStartedFragment_to_shortWorkoutEndFragment)
                }


            }

        }.start()

    }

    private fun setExerciseView() {

        ll_restView.visibility = View.INVISIBLE
        ll_exerciseView.visibility = View.VISIBLE

        exerciseTimer?.cancel()
        exerciseProgress = 0

        setExerciseProgressBar()
        ivImage.visibility = View.GONE
        // ivImage.setImageResource(exerciseList!![currentExercisePosition].getImage())
        tvCurrentExercise.text = workoutList!![currentExercisePosition].getName()


    }

    private fun setExerciseVideo() {
        vvVideo.visibility = View.VISIBLE

        val uri: Uri = Uri.parse(workoutList!![currentExercisePosition + 1].getVideo())

        vvVideo.setVideoURI(uri)
        vvVideo.start()
        vvVideo.setOnPreparedListener {

            mMediaPlayer = it
            mMediaPlayer!!.isLooping = true

        }
    }

    /*private fun setupRecyclerView(){
        rvExerciseStatus.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false)

        exerciseStatusAdapter = ExerciseStatusAdapter(exerciseList!!,this)
        rvExerciseStatus.adapter = exerciseStatusAdapter
    }*/

    private fun setupRecyclerView() = rvExerciseStatus.apply {
        exerciseStatusAdapter = ShowRemainingExercisesAdapter()
        adapter = exerciseStatusAdapter
        layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }
}