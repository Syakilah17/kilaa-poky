package com.example.kila_pocky.kl_pocky

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.kila_pocky.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val sharedPref = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
            val isLoggedIn = sharedPref.getBoolean("isLogin", false)

            if (isLoggedIn) {
                // Alur A -> C: Jika sudah login, langsung ke MainActivity
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                // Alur A -> B: Jika belum login, ke LoginActivity
                startActivity(Intent(this, LoginActivity::class.java))
            }
            finish()
        }, 2000) // Delay 2 detik
    }
}