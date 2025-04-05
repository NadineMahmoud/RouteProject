package com.example.routegraduationproject

import ImageAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import java.util.Arrays

class ProductOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_one)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)

        // Replace with your actual drawable resources
        val images = listOf(
            R.drawable.slideone,  // Make sure you have these images in your drawable folder
            R.drawable.slidethree,
            R.drawable.lastslide
        )

        val adapter = ImageAdapter(images)
        viewPager.adapter = adapter
    }
}
