package com.example.routegraduationproject

import ImageAdapter
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
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

        val sizeViews = listOf(
            findViewById<TextView>(R.id.size_38),
            findViewById<TextView>(R.id.size_39),
            findViewById<TextView>(R.id.size_40),
            findViewById<TextView>(R.id.size_41),
            findViewById<TextView>(R.id.size_42),
        )

        sizeViews.forEach { view ->
            view.setOnClickListener {
                sizeViews.forEach { it.isSelected = false }
                view.isSelected = true
            }
        }

        var count = 1

        val btnPlus = findViewById<MaterialButton>(R.id.btn_plus)
        val btnMinus = findViewById<MaterialButton>(R.id.btn_minus)
        val tvCount = findViewById<TextView>(R.id.tv_count)

        btnPlus.setOnClickListener {
            count++
            tvCount.text = count.toString()
        }

        btnMinus.setOnClickListener {
            if (count > 1) {
                count--
                tvCount.text = count.toString()
            }
        }

    }
}
