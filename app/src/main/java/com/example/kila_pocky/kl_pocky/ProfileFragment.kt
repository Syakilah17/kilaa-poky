package com.example.kila_pocky.kl_pocky

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.kila_pocky.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout fragment
        val view = inflater.inflate(R.layout.activity_profile_fragment, container, false)

        // Temukan tombol logout di dalam view
        val btnLogout = view.findViewById<Button>(R.id.btnLogout)
        btnLogout?.setOnClickListener {
            (activity as? MainActivity)?.logoutUser()
        }

        return view
    }
}