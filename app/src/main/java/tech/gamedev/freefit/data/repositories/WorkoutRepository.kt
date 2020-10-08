package tech.gamedev.freefit.data.repositories

import tech.gamedev.freefit.data.db.workoutdata.workouts.Workouts

class WorkoutRepository(
) {

    fun getShortWorkouts() = Workouts.getShortWorkoutList()
}
