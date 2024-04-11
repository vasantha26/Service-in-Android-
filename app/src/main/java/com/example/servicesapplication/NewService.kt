package com.example.servicesapplication

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log


class NewService : Service() {

    private lateinit var player: MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("TAG" , " MainActivity >>> NewService " )
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)

        player.isLooping = true

        player.start()

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG" , " MainActivity >>> onDestroy " )

        player.stop()
    }
    override fun onBind(intent: Intent?): IBinder? {
        Log.d("TAG" , " MainActivity >>> onBind " )

        return null
    }
}