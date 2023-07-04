package com.example.d6_kotlin_service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.d6_kotlin_service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serviceIntent = Intent(this, BackgroundService::class.java)
        binding.btnStart.setOnClickListener{
            Log.i("myTag", "starting")
            startService(serviceIntent)
        }
        binding.btnStop.setOnClickListener{
            Log.i("myTag", "stopping")
            stopService(serviceIntent)
        }
    }
}