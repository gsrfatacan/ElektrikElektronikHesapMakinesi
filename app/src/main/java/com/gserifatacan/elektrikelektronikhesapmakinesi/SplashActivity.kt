package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imageSplash.alpha = 0f
            imageSplash.animate().setDuration(1000).alpha(1f).withEndAction {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                binding.progressBar.visibility = View.VISIBLE
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }
        }
    }
}