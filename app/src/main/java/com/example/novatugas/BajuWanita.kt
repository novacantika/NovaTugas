package com.example.novatugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BajuWanita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baju_wanita)
        supportActionBar?.title = "Baju Wanita"
    }
}