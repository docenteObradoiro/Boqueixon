package com.example.boqueixon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageButton

class RutaPescadores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ruta_pescadores)

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