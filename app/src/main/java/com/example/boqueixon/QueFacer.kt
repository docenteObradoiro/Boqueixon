package com.example.boqueixon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageButton

class QueFacer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quehacer)

        var logoboqueixon=findViewById<ImageButton>(R.id.logoboqueixon)
        logoboqueixon.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        var menu = findViewById<ImageButton>(R.id.menuHamburguesa2)
        menu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        var buttonfestas=findViewById<ImageButton>(R.id.buttonfestas)
        buttonfestas.setOnClickListener {
            val acceder= Intent(this, FestasEFeiras::class.java)
            startActivity(acceder)
        }

        var buttonareas=findViewById<ImageButton>(R.id.buttonareas)
        buttonareas.setOnClickListener {
            val acceder= Intent(this, AreasNaturais::class.java)
            startActivity(acceder)
        }

        var buttonrutas=findViewById<ImageButton>(R.id.buttonrutas)
        buttonrutas.setOnClickListener {
            val acceder= Intent(this, Rutas::class.java)
            startActivity(acceder)
        }


    }
}