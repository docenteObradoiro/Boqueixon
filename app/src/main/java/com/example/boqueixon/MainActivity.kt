package com.example.boqueixon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonQueFacer=findViewById<Button>(R.id.buttonQueFacer)
        buttonQueFacer.setOnClickListener {
            val acceder= Intent(this, QueFacer::class.java)
            startActivity(acceder)
        }
    }
}