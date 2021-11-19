package com.example.novatugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BajuPria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baju_pria)
        supportActionBar?.title = "Baju Pria"
    }
}