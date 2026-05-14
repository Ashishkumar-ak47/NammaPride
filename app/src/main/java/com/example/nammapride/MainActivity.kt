package com.example.nammapride

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVerify = findViewById<Button>(R.id.btnVerify)
        val btnCatalog = findViewById<Button>(R.id.btnCatalog)
        val btnArtisan = findViewById<Button>(R.id.btnArtisan)
        val btnHow = findViewById<Button>(R.id.btnHow)

        btnVerify.setOnClickListener {
            startActivity(Intent(this, VerifyActivity::class.java))
        }

        btnCatalog.setOnClickListener {
            startActivity(Intent(this, CatalogActivity::class.java))
        }

        btnArtisan.setOnClickListener {
            startActivity(Intent(this, ArtisanActivity::class.java))
        }

        btnHow.setOnClickListener {
            startActivity(Intent(this, HowActivity::class.java))
        }
    }
}