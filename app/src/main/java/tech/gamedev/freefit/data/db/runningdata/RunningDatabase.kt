package tech.gamedev.freefit.data.db.runningdata

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import tech.gamedev.freefit.data.db.workoutdata.Workout

@Database(
    entities = [Run::class, Workout::class],
    version = 2
)

//Telling ROOM We are using converters for Bitmap and in what class the methods are stored
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO
}