package com.example.d6_kotlin_service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.d6_kotlin_service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{

        }
        binding.btnStop.setOnClickListener{

        }

    }
}