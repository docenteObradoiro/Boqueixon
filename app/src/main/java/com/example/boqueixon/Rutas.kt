
package com.example.boqueixon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageButton

class Rutas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rutas)

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

        var pico=findViewById<ImageButton>(R.id.pico)
        pico.setOnClickListener {
            val acceder= Intent(this, RutaPico::class.java)
            startActivity(acceder)
        }

        var pescadores=findViewById<ImageButton>(R.id.pescadores)
        pescadores.setOnClickListener {
            val acceder= Intent(this, RutaPescadores::class.java)
            startActivity(acceder)
        }

        var prata=findViewById<ImageButton>(R.id.prata)
        prata.setOnClickListener {
            val acceder= Intent(this, RutaPrata::class.java)
            startActivity(acceder)
        }

    }
}