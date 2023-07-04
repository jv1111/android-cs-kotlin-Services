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
        Log.i("myTag","Service started")
        return START_STICKY
    }

    override fun onDestroy() {
        Log.i("myTag","Service destroyed")
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? = null

}