package com.victor.proyectoandroid

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<AppCompatButton>(R.id.button)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val Checkbox = findViewById<CheckBox>(R.id.checkBox)

        Checkbox.setOnClickListener {
            if (Checkbox.isChecked()) Checkbox.text = "Mayor de edad" else Checkbox.text = "Es necesario para seguir"
        };

        etName.text.toString()
        button.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
            }
        }
    }
}