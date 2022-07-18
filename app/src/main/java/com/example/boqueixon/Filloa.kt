package com.example.boqueixon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageButton

class Filloa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filloa)

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
        val maps = findViewById<ImageButton>(R.id.botonFilloa)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/Campo+da+Feira+de+Lestedo/@42.7900436,-8.5434555,13z/data=!4m9!1m2!2m1!1scampo+da+festa+de+lestedo!3m5!1s0xd2faa13d0cdd8e5:0xc2a165279c4d79ae!8m2!3d42.7985016!4d-8.4701196!15sChljYW1wbyBkYSBmZXN0YSBkZSBsZXN0ZWRvWhsiGWNhbXBvIGRhIGZlc3RhIGRlIGxlc3RlZG-SAQpmYWlyZ3JvdW5kmgEgQ2hSRFNVaE5NRzluUzBWSlEwRm5TVU5YTWpVd1ZoQUI")))
        }
    }
}