package com.example.kila_pocky.kl_pocky

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kila_pocky.R

class activity_about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Tombol Buka Website Pocky
        val btnBukaWeb = findViewById<Button>(R.id.btnBukaWeb)
        btnBukaWeb.setOnClickListener {
            val intent = Intent(this, activity_web::class.java)
            startActivity(intent)
        }
    }
}