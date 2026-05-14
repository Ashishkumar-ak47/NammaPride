package com.example.nammapride

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class ArtisanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artisan)
        val backBtn = findViewById<Button>(R.id.btnBack)

        backBtn.setOnClickListener {
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}