package net.softglobe.roomtutorial

import androidx.room.TypeConverter
import java.util.Date

class Conveters {

    @TypeConverter
    fun saveDateToDatabase(date : Date) : Long{
        return date.time
    }

    @TypeConverter
    fun retrieveDateFromDatabase(date : Long) : Date {
        return Date(date)
    }
}