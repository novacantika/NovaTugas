package com.example.novatugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnbajuPria: Button = findViewById(R.id.btn_baju_pria)
        btnbajuPria.setOnClickListener(this)

        val btnbajuWanita: Button = findViewById(R.id.btn_baju_wanita)
        btnbajuWanita.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_baju_pria -> {
                val bajuPriaIntent = Intent(this@MainActivity, BajuPria::class.java)
                startActivity(bajuPriaIntent)
            }
            R.id.btn_baju_wanita -> {
                val bajuWanitaIntent = Intent (this@MainActivity, BajuWanita::class.java)
                startActivity(bajuWanitaIntent)
            }
        }
    }
}