package net.softglobe.roomtutorial

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import java.util.Date

class MainActivity : AppCompatActivity() {
    lateinit var dbInstance : ProductDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbInstance = ProductDatabase.getInstance(this)

        lifecycleScope.launch {
            dbInstance.productDao.deleteProduct(Product("Pen", 10.0, Date(),1))
            dbInstance.productDao.deleteProduct(Product("Chair", 500.0, Date(),2))
            dbInstance.productDao.deleteProduct(Product("Laptop", 35000.0,Date(),3))
            dbInstance.productDao.deleteProduct(Product("Table", 5000.0,Date(),4))
            dbInstance.productDao.deleteProduct(Product("Mobile", 10000.0,Date(),5))

            Log.d("MainActivityRoom", "Product List: "+dbInstance.productDao.getProducts())
        }
    }
}