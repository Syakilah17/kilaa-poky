package com.example.kila_pocky.kl_pocky

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kila_pocky.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tombol Lihat Varian
        val btnVarian = findViewById<Button>(R.id.btnVarian)
        btnVarian?.setOnClickListener {
            startActivity(Intent(this, activity_varian::class.java))
        }

        // Tombol Tentang Pocky
        val btnAbout = findViewById<Button>(R.id.btnAbout)
        btnAbout?.setOnClickListener {
            startActivity(Intent(this, activity_about::class.java))
        }

        // Tombol Profil Developer
        val btnProfile = findViewById<Button>(R.id.btnProfile)
        btnProfile?.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        // Tombol Logout
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        btnLogout?.setOnClickListener {
            val sharedPref = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.clear()
            editor.apply()

            // Kembali ke Halaman Login
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}