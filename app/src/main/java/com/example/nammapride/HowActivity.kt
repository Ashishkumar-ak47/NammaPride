package com.example.nammapride

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class HowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how)
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