package tech.gamedev.freefit.data.db.workoutdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_table")
class Workout(

    private var img: Int = 0,
    private var name: String,
    private var amount: String,
    private var timeStamp: Long,
    private var isCompleted: Boolean,
    private var isSelected: Boolean,
    private var video: String
) {
//GETTERS AND SETTERS

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    fun getAmount(): String {
        return amount
    }

    fun setAmount(amount: String) {
        this.amount = amount
    }

    fun getVideo(): String {
        return video
    }

    fun setVideo(video: String) {
        this.video = video
    }


    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getImage(): Int {
        return img
    }

    fun setImage(image: Int) {
        this.img = image
    }

    fun getIsCompleted(): Boolean {
        return isCompleted
    }

    fun setIsCompleted(isCompleted: Boolean) {
        this.isCompleted = isCompleted
    }

    fun getIsSelected(): Boolean {
        return isSelected
    }

    fun setIsSelected(isSelected: Boolean) {
        this.isSelected = isSelected
    }

    fun getTimeStamp(): Long {
        return timeStamp
    }

    fun getImg(): Int {
        return img
    }

    fun setTimeStamp(timeStamp: Long) {
        this.timeStamp = timeStamp
    }
}