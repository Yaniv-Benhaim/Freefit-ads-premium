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
                R.drawable.img_short_workout,
                "Short Workout",
                "0",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_side_plank
            )

            workoutList.add(finished)

            return workoutList
        }

        fun getAthenaWorkout(): ArrayList<Workout> {

            val workoutList = ArrayList<Workout>()

            val climbers = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "25x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers)

            val situps = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "25x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps)


            val squats = Workout(
                R.drawable.img_squats,
                "Squats",
                "25x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )

            workoutList.add(squats)

            val rest =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )

            workoutList.add(rest)

            val climbers2 = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers2)

            val situps2 = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps2)


            val squats2 = Workout(
                R.drawable.img_squats,
                "Squats",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )

            workoutList.add(squats2)

            val rest2 =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )
            workoutList.add(rest2)

            val climbers3 = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "15x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers3)

            val situps3 = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "15x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps3)


            val squats3 = Workout(
                R.drawable.img_squats,
                "Squats",
                "15x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )

            workoutList.add(squats3)

            val rest3 =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )
            workoutList.add(rest3)


            val climbers4 = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers4)

            val situps4 = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps4)


            val squats4 = Workout(
                R.drawable.img_squats,
                "Squats",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )

            workoutList.add(squats4)

            val rest4 =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )

            workoutList.add(rest4)

            val climbers5 = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "5x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers5)

            val situps5 = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "5x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps5)


            val squats5 = Workout(
                R.drawable.img_squats,
                "Squats",
                "5x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )

            workoutList.add(squats5)

            val rest5 =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )

            workoutList.add(rest5)

            val finished = Workout(
                R.drawable.img_short_workout,
                "Athena Workout",
                "0",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_side_plank
            )

            workoutList.add(finished)


            return workoutList

        }

        fun getMorpheusWorkout(): ArrayList<Workout> {

            val workoutList = ArrayList<Workout>()

            val pushups1 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "5x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups1)

            val lunges1 = Workout(
                R.drawable.img_lunges,
                "Lunges",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_lunges
            )

            workoutList.add(lunges1)


            val jumpingJacks1 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks1)

            val pushups2 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "7x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups2)

            val lunges2 = Workout(
                R.drawable.img_lunges,
                "Lunges",
                "15x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_lunges
            )

            workoutList.add(lunges2)


            val jumpingJacks2 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks2)


            val pushups3 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups3)

            val lunges3 = Workout(
                R.drawable.img_lunges,
                "Lunges",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_lunges
            )

            workoutList.add(lunges3)


            val jumpingJacks3 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "40x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks3)


            val pushups4 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "7x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups4)

            val lunges4 = Workout(
                R.drawable.img_lunges,
                "Lunges",
                "15x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_lunges
            )

            workoutList.add(lunges4)


            val jumpingJacks4 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks4)


            val pushups5 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "5x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups5)

            val lunges5 = Workout(
                R.drawable.img_lunges,
                "Lunges",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_lunges
            )

            workoutList.add(lunges5)


            val jumpingJacks5 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks5)

            val finished = Workout(
                R.drawable.img_short_workout,
                "Morpheus Workout",
                "0",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_side_plank
            )

            workoutList.add(finished)


            return workoutList

        }

        fun getPrometheusWorkout(): ArrayList<Workout> {

            val workoutList = ArrayList<Workout>()

            val climbers = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers)

            val pushups = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups)


            val situps = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps)

            val squats = Workout(
                R.drawable.img_squats,
                "Squats",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )
            workoutList.add(squats)

            val jumpingJacks = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "50x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks)

            val rest =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )

            workoutList.add(rest)

            val climbers2 = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers2)

            val pushups2 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "7x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups2)


            val situps2 = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps2)

            val squats2 = Workout(
                R.drawable.img_squats,
                "Squats",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )
            workoutList.add(squats2)

            val jumpingJacks2 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "50x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks2)

            val rest2 =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )

            workoutList.add(rest2)

            val climbers3 = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers3)

            val pushups3 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "5x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups3)


            val situps3 = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps3)

            val squats3 = Workout(
                R.drawable.img_squats,
                "Squats",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )
            workoutList.add(squats3)

            val jumpingJacks3 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "50x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks3)

            val rest3 =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )

            workoutList.add(rest3)

            val climbers4 = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers4)

            val pushups4 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "7x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups4)


            val situps4 = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps4)

            val squats4 = Workout(
                R.drawable.img_squats,
                "Squats",
                "20x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )
            workoutList.add(squats4)

            val jumpingJacks4 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "50x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks4)

            val rest4 =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )

            workoutList.add(rest4)

            val climbers5 = Workout(
                R.drawable.img_climbers,
                "Climbers",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.climbers
            )

            workoutList.add(climbers5)

            val pushups5 = Workout(
                R.drawable.img_pushup,
                "Push ups",
                "10x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_pushup
            )

            workoutList.add(pushups5)


            val situps5 = Workout(
                R.drawable.img_situps,
                "Sit ups",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.situps
            )

            workoutList.add(situps5)

            val squats5 = Workout(
                R.drawable.img_squats,
                "Squats",
                "30x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_squats
            )
            workoutList.add(squats5)

            val jumpingJacks5 = Workout(
                R.drawable.img_jumping_jacks,
                "Jumping Jacks",
                "50x",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_jumping_jacks
            )

            workoutList.add(jumpingJacks5)

            val rest5 =
                Workout(
                    R.drawable.img_rest,
                    "Rest",
                    "25s",
                    0L,
                    false,
                    false,
                    "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_rest
                )

            workoutList.add(rest5)

            val finished = Workout(
                R.drawable.img_short_workout,
                "Prometheus Workout",
                "0",
                0L,
                false,
                false,
                "android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.raw.vid_side_plank
            )

            workoutList.add(finished)


            return workoutList

        }
    }
}
