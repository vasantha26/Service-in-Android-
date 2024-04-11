package com.example.servicesapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() , View.OnClickListener{

    private var start: Button? = null
    private var stop: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start = findViewById<View>(R.id.startButton) as Button


        stop = findViewById<View>(R.id.stopButton) as Button

        start!!.setOnClickListener(this)
        stop!!.setOnClickListener(this)

    }

    override fun onClick(view: View?) {

        if (view === start) {
            Log.d("TAG" , " MainActivity >>> start " )
            startService(Intent(this, NewService::class.java))
        } else if (view === stop) {
            Log.d("TAG" , " MainActivity >>> stop " )
            stopService(Intent(this, NewService::class.java))
        }


    }
}