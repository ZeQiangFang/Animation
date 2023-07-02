package com.zq.animation.frame

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zq.animation.R

class MainActivity : AppCompatActivity() {

    lateinit var animationDrawable:AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animationDrawable = findViewById<View>(R.id.view).background as AnimationDrawable
//        animationDrawable.isOneShot = true
    }

    fun startAnimation(view: View) {
        animationDrawable.start()
    }

    fun endAnimation(view: View) {
        animationDrawable.stop()
    }
}