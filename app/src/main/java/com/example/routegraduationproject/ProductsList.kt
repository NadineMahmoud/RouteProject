package com.example.routegraduationproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.routegraduationproject.databinding.ProductsListBinding

class ProductsList : AppCompatActivity() {
    private lateinit var binding: ProductsListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProductsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.product3Card.setOnClickListener {
            val intent = Intent(this, ProductOneActivity::class.java)
            startActivity(intent)
        }

    }
}