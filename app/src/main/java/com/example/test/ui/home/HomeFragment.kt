package com.example.test.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.test.*
import com.example.test.ui.dashboard.DashboardFragment
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)


        root.card1.setOnClickListener {
            val intent=Intent(activity,Destinasi::class.java)
            startActivity(intent)
        }
        root.card2.setOnClickListener {
            val intent=Intent(activity,Akomodasi::class.java)
            startActivity(intent)
        }
        root.card3.setOnClickListener {
            val intent=Intent(activity,Kuliner::class.java)
            startActivity(intent)
        }

        root.btn_beli.setOnClickListener {
            val intent=Intent(activity,Saygon::class.java)
            startActivity(intent)
        }
        root.card_1.setOnClickListener{
            val intent=Intent(activity,Saygon::class.java)
            startActivity(intent)
        }
        return root


        }

}