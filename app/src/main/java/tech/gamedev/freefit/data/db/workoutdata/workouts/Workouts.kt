package tech.gamedev.freefit.data.db.workoutdata.workouts

import tech.gamedev.freefit.BuildConfig
import tech.gamedev.freefit.R
import tech.gamedev.freefit.data.db.workoutdata.Workout

class Workouts {

    companion object {
        fun getShortWorkoutList(): ArrayList<Workout> {
            val workoutList = ArrayList<Workout>()

            val jumpingJacks = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks)

            val wallSit = Workout(
                R.drawable.img_wall_sits,
                "Wall Sit",
                "60s",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_wallsit
            )

            workoutList.add(wallSit)


            val pushUp = Workout(
                R.drawable.img_pushup,
                "Push Ups",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushUp)

            val abdominalCrunch =
                Workout(
                    R.drawable.img_abdominal_crunch,
                    "Crunches",
                    "15x",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_crunches
                )

            workoutList.add(abdominalCrunch)

            val stepUpOnChair =
                Workout(
                    R.drawable.img_step_ups,
                    "Step-Ups",
                    "20x",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_stepups
                )
            workoutList.add(stepUpOnChair)

            val squat = Workout(
                R.drawable.img_squats,
                "Squats",
                "15x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )

            workoutList.add(squat)

            val tricepDipOnChair =
                Workout(
                    R.drawable.img_tricep_dips,
                    "Tricep Dips",
                    "10x",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_tricep_dips
                )
            workoutList.add(tricepDipOnChair)

            val plank = Workout(
                R.drawable.img_plank,
                "Plank",
                "60s",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_plank
            )
            workoutList.add(plank)

            val highKneesRunningInPlace =
                Workout(
                    R.drawable.img_high_knees_running,
                    "High knees running",
                    "60s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_high_knees
                )
            workoutList.add(highKneesRunningInPlace)

            val lunges = Workout(
                R.drawable.img_lunges,
                "Lunges",
                "12x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_lunges
            )

            workoutList.add(lunges)

            val pushupAndRotation =
                Workout(
                    R.drawable.img_pushup_rotation,
                    "Push ups with rotation",
                    "10x",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushups_pro
                )
            workoutList.add(pushupAndRotation)

            val sidePlank = Workout(
                R.drawable.img_side_plank,
                "Side Plank",
                "60s",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_side_plank
            )

            workoutList.add(sidePlank)

            val finished = Workout(
                R.drawable.img_side_plank,
                "finished",
                "0",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_side_plank
            )

            workoutList.add(sidePlank)

            return workoutList
        }
    }
}
