package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.adapter.ProductAdapter

class MainActivity : AppCompatActivity() {

    val listOfProducts = arrayListOf<Product>()
    lateinit var recyclerview : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview = findViewById(R.id.recyclerView)
        listOfProducts.add(
            Product("Prada",
                    "https://image.shutterstock.com/image-photo/milan-italy-september-22-2018-260nw-1212003619.jpg",
                500.0,
                5))
        listOfProducts.add(
            Product("Chanel",
                "https://www.istockphoto.com/photo/white-chanel-bag-gm588243086-100987085",
                499.99,
                7))
        listOfProducts.add(
            Product( "Dior",
                "https://www.dior.com/en_int/products/couture-M0446CTZQ_M928-saddle-bag-blue-dior-oblique-jacquard",
                789.99,
                15))
        recyclerview.adapter = ProductAdapter(listOfProducts)

    }
}