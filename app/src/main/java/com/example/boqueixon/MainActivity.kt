package com.example.boqueixon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.boqueixon.Alojamiento.Alojamiento

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var accesoAlojamiento = findViewById<Button>(R.id.buttonAloxamento)
        accesoAlojamiento.setOnClickListener{
            val acceder = Intent(this, Alojamiento::class.java)
            startActivity(acceder)
        }
    }
}