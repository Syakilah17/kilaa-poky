package com.example.kila_pocky.kl_pocky

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kila_pocky.R

class activity_varian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_varian)

        // Klik Pocky Strawberry untuk ke Halaman Detail
        val btnStrawberry = findViewById<Button>(R.id.btnStrawberry)
        btnStrawberry?.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

        // Tombol Kembali
        val btnKembali = findViewById<Button>(R.id.btnKembaliVarian)
        btnKembali?.setOnClickListener {
            finish()
        }
    }
}