package com.zq.animation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import android.widget.TextView
import com.zq.animation.R

class ViewAnimationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)
    }


    fun onClick(view: View) {
        when (view.id) {
            R.id.tv_alpha -> {
                val alphaAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
                view.startAnimation(alphaAnimation)
            }
            R.id.tv_scale -> {
                val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
                view.startAnimation(animation)
            }
            R.id.tv_translate -> {
                val animation = AnimationUtils.loadAnimation(this, R.anim.translate)
                view.startAnimation(animation)
            }
            R.id.tv_rotate -> {
                val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
                view.startAnimation(animation)
            }
            R.id.tv_set -> {
                val animation = AnimationUtils.loadAnimation(this, R.anim.set)
                view.startAnimation(animation)
            }
            R.id.tv_accelerate,R.id.tv_linear -> {
                val tvAccelerate = findViewById<TextView>(R.id.tv_accelerate)
                val animationAccelerate = AnimationUtils.loadAnimation(this, R.anim.translate2)
                animationAccelerate.interpolator = AccelerateInterpolator()
                tvAccelerate.startAnimation(animationAccelerate)

                val tvLinear = findViewById<TextView>(R.id.tv_linear)
                val animationLinear = AnimationUtils.loadAnimation(this, R.anim.translate2)
                animationLinear.interpolator = LinearInterpolator()
                tvLinear.startAnimation(animationLinear)
            }
        }
    }
}