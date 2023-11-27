package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.animation.BounceInterpolator
import androidx.appcompat.app.AppCompatActivity
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animasyonImage = ObjectAnimator.ofFloat(binding.imageSplash, "rotation", 0.0f, 360.0f)
        val animasyonText = ObjectAnimator.ofFloat(binding.progressBar, "translationY", 800.0f, 0.0f)
        val baslat = AnimatorSet().apply {
            duration = 1000
            interpolator = BounceInterpolator()
            playTogether(animasyonImage, animasyonText)
        }
        baslat.start()
        animasyonImage.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
            }

            override fun onAnimationEnd(animation: Animator) {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            override fun onAnimationCancel(animation: Animator) {
            }

            override fun onAnimationRepeat(animation: Animator) {
            }
        })
    }
}