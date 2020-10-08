package tech.gamedev.freefit.data.repositories


import tech.gamedev.freefit.data.db.runningdata.Run
import tech.gamedev.freefit.data.db.runningdata.RunDAO
import javax.inject.Inject


class MainRepository @Inject constructor(
    val runDAO: RunDAO
) {

    suspend fun insertRun(run: Run) = runDAO.insertRun(run)
    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()
    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvarageSpeed()
    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()
    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()
    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getTotalAverageSpeed()
    fun getTotalDistance() = runDAO.getTotalDistanceInMeters()
    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()
    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()
}