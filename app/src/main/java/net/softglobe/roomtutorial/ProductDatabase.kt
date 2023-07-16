package net.softglobe.roomtutorial

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Product::class], version = 1)
@TypeConverters(Conveters::class)
abstract class ProductDatabase : RoomDatabase(){
    abstract val productDao : ProductDao

    companion object {
        private var instance : ProductDatabase? = null

        fun getInstance(context: Context) : ProductDatabase {
            if (instance == null){
                instance = Room.databaseBuilder(context, ProductDatabase::class.java, "productdb.db").build()
            }

            return instance!!
        }
    }

}