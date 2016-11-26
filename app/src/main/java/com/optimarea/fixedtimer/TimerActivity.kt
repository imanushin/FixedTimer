package com.optimarea.fixedtimer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

sealed class TimerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)
    }
}
