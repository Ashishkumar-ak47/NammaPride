package com.example.nammapride

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

class VerifyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        val db = FirebaseFirestore.getInstance()
        val backBtn = findViewById<Button>(R.id.btnBack)
        val image = findViewById<ImageView>(R.id.toyImage)
        backBtn.setOnClickListener {
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val input = findViewById<EditText>(R.id.editTextId)
        val button = findViewById<Button>(R.id.btnVerify)
        val text = findViewById<TextView>(R.id.textResult)

        button.setOnClickListener {
            val toyId = input.text.toString()

            db.collection("toys")
                .whereEqualTo("toyId", toyId)
                .get()
                .addOnSuccessListener { documents ->
                    if (!documents.isEmpty) {
                        val doc = documents.documents[0]

                        val name = doc.getString("name")
                        val artisan = doc.getString("artisanName")

                        text.text = "Toy: $name\nArtisan: $artisan"
                        when (toyId) {
                            "123456" -> image.setImageResource(R.drawable.elephant)
                            "222222" -> image.setImageResource(R.drawable.car)
                            "333333" -> image.setImageResource(R.drawable.top)
                            "444444" -> image.setImageResource(R.drawable.doll)
                            else -> image.setImageResource(R.drawable.logo)
                        }
                    } else {
                        text.text = "Invalid Toy ID"
                    }
                }
                .addOnFailureListener { e ->
                    text.text = "Error: ${e.message}"
                }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
