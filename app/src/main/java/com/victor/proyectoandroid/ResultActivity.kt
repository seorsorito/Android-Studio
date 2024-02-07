package com.victor.proyectoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputEditText

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val textViewResult = findViewById<TextInputEditText>(R.id.textViewResult)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()

    }
}