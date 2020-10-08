package tech.gamedev.freefit.data.db.runningdata

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap? = null,
    var timestamp: Long = 0L,
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L,
    var caloriesBurned: Int = 0
) {

    //Lets ROOM auto generate an id for each object created
    //so it can identify and separate objects by id
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}