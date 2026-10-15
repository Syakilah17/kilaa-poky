package com.example.kila_pocky.kl_pocky

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.kila_pocky.R

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_about_fragment, container, false)

        // Temukan tombol kunjungi web
        val btnKunjungiWeb = view.findViewById<Button>(R.id.btnKunjungiWeb)
        btnKunjungiWeb?.setOnClickListener {
            val intent = Intent(requireContext(), activity_web::class.java)
            startActivity(intent)
        }

        return view
    }
}