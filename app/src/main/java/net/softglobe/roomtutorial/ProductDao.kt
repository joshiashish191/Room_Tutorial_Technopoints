package net.softglobe.roomtutorial

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface ProductDao {

    @Upsert
    suspend fun upsertProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("SELECT * FROM Product")
    suspend fun getProducts() : List<Product>

}