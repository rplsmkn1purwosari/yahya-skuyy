package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_destinasi.*

class Destinasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destinasi)

        pilsaygon.setOnClickListener { startActivity(Intent(this,Saygon::class.java)) }
        card_1.setOnClickListener { startActivity(Intent(this,Saygon::class.java)) }
        btn_beli.setOnClickListener { startActivity(Intent(this,Saygon::class.java)) }

    }
}
