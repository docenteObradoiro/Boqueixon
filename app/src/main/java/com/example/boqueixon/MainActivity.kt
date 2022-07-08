package com.example.boqueixon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var picoSacro=findViewById<Button>(R.id.buttonPicoSacro)
        picoSacro.setOnClickListener {
            val acceder= Intent(this, PicoSacro::class.java)
            startActivity(acceder)
        }
    }
}