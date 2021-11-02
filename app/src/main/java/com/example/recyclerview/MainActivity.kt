package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            Image("Image One", R.drawable.carone),
            Image("Image two", R.drawable.cartwo),
            Image("Image three", R.drawable.carthree),
            Image("Image four", R.drawable.carfour)
        )

        val recyclerview = findViewById<RecyclerView>(R.id.imageRecyclerView)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.adapter = ImageAdapter(this, images)
    }
}