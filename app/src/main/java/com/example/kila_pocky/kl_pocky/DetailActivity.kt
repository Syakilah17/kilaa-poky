package com.example.kila_pocky.kl_pocky

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kila_pocky.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnKembali = findViewById<Button>(R.id.btnKembali)
        btnKembali.setOnClickListener {
            finish() // Menutup halaman detail dan kembali ke halaman sebelumnya
        }
    }
}