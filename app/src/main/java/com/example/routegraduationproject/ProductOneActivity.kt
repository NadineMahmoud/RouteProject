package com.example.routegraduationproject

import ImageAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.routegraduationproject.databinding.ActivityProductOneBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.Arrays

class ProductOneActivity : AppCompatActivity() {
    private lateinit var binding : ActivityProductOneBinding
    private lateinit var databaseReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProductOneBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val viewPager: ViewPager2 = findViewById(R.id.viewPager)

        val images = listOf(
            R.drawable.slideone,
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
        binding.back.setOnClickListener {
            val intent = Intent(this, ProductsList::class.java)
            startActivity(intent)
        }

    }
}
