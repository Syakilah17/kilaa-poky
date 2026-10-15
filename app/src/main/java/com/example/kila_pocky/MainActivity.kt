package com.example.kila_pocky.kl_pocky

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.kila_pocky.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Tampilkan HomeFragment saat pertama kali dibuka
        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
        }

        // Event listener saat menu Bottom Navigation diklik
        bottomNav?.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.nav_about -> {
                    loadFragment(AboutFragment())
                    true
                }
                R.id.nav_profile -> {
                    loadFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

    // Fungsi untuk mengganti Fragment di container
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    // Fungsi Logout (bisa dipanggil dari mana saja/Fragment)
    fun logoutUser() {
        val sharedPref = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.clear()
        editor.apply()

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}