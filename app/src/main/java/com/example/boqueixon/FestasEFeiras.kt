package com.example.boqueixon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageButton

class FestasEFeiras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festas_efeiras)

        var buttonfeirasmercados=findViewById<ImageButton>(R.id.buttonfeirasmercados)
        buttonfeirasmercados.setOnClickListener {
            val acceder= Intent(this, FeirasMercados::class.java)
            startActivity(acceder)
        }

        var buttonfilloa=findViewById<ImageButton>(R.id.buttonfilloa)
        buttonfilloa.setOnClickListener {
            val acceder= Intent(this, Filloa::class.java)
            startActivity(acceder)
        }

        var buttonentroido=findViewById<ImageButton>(R.id.buttonentroido)
        buttonentroido.setOnClickListener {
            val acceder= Intent(this, Entroido::class.java)
            startActivity(acceder)
        }

        var buttonrelixiosas=findViewById<ImageButton>(R.id.buttonrelixiosas)
        buttonrelixiosas.setOnClickListener {
            val acceder= Intent(this, RelixiosasVerbenas::class.java)
            startActivity(acceder)
        }

        var logoboqueixon=findViewById<ImageButton>(R.id.logoboqueixon)
        logoboqueixon.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        var menu = findViewById<ImageButton>(R.id.menuHamburguesa2)
        menu.setOnClickListener {
            val acceder = Intent(this, com.example.boqueixon.Menu::class.java)
            startActivity(acceder)
        }
    }
}