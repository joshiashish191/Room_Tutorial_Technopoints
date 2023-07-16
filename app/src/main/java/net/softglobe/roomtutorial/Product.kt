package net.softglobe.roomtutorial

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Product(
    val name : String,
    val price : Double,
    val date : Date,
    @PrimaryKey(autoGenerate = true)
    val id : Int? = null
)
