package com.example.d6_kotlin_service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class BackgroundService : Service(){

    init {
        Log.i("myTag","Service created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(Tag,"Service started")
        val name = intent?.getStringExtra(dataName)
        val mark = intent?.getIntExtra(MARKS, 0)
        Log.i( Tag, "name: $name")
        Log.i(Tag, "mark: $mark")
        return START_STICKY//START_NOT_STICKY etc...
    }

    override fun onDestroy() {
        Log.i(Tag,"Service destroyed")
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? = null

    companion object{
        const val Tag = "myTag"
        const val dataName = "dataName"
        const val MARKS = "TOTAL MARKS"
    }

}