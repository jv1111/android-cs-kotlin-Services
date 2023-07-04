package com.example.d6_kotlin_service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.d6_kotlin_service.BackgroundService.Companion.MARKS
import com.example.d6_kotlin_service.BackgroundService.Companion.Tag
import com.example.d6_kotlin_service.BackgroundService.Companion.dataName
import com.example.d6_kotlin_service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serviceIntent = Intent(this, BackgroundService::class.java)
        serviceIntent.putExtra(dataName, "dataValue")
        serviceIntent.putExtra(MARKS, 77)
        binding.btnStart.setOnClickListener{
            Log.i(Tag, "starting")
            startService(serviceIntent)
        }
        binding.btnStop.setOnClickListener{
            Log.i(Tag, "stopping")
            stopService(serviceIntent)
        }
    }
}