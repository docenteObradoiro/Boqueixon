package com.example.boqueixon.gastronomia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.example.boqueixon.MainActivity
import com.example.boqueixon.R

class Gastronomia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastronomia)


        var menu = findViewById<ImageButton>(R.id.menuHamburguesa2)
        menu.setOnClickListener {
            val acceder = Intent(this, com.example.boqueixon.Menu::class.java)
            startActivity(acceder)
        }
        val outrosEstablecementos = findViewById<ImageButton>(R.id.btOutrosEstablecementos)
        outrosEstablecementos.setOnClickListener {
            val acceder = Intent (this, OutrosEstablecementos::class.java)
            startActivity(acceder)
        }
        val ondeComer = findViewById<ImageButton>(R.id.btRestaurantes)
        ondeComer.setOnClickListener {
            val acceder = Intent (this, OndeComer::class.java)
            startActivity(acceder)
        }
        val bares = findViewById<ImageButton>(R.id.btBares)
        bares.setOnClickListener {
            val acceder = Intent (this, Bares::class.java)
            startActivity(acceder)
        }

    }
}