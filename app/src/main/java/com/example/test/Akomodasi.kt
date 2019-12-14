package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_destinasi.*

class Akomodasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akomodasi)
        pilsaygon.setOnClickListener { startActivity(Intent(this,Hotel::class.java)) }
        card_1.setOnClickListener { startActivity(Intent(this,Hotel::class.java)) }
        btn_beli.setOnClickListener { startActivity(Intent(this,Hotel::class.java)) }

    }
}
