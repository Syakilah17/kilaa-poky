package com.example.kila_pocky.kl_pocky

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kila_pocky.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnKembali = findViewById<Button>(R.id.btnKembaliProfile)
        btnKembali?.setOnClickListener {
            finish()
        }
    }
}