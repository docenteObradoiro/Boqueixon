package com.example.boqueixon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.boqueixon.Alojamiento.Alojamiento
import com.example.boqueixon.gastronomia.Gastronomia

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        var accesoPrincipal = findViewById<ImageButton>(R.id.logoboqueixon)
        accesoPrincipal.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        var sairMenu = findViewById<ImageButton>(R.id.equis)
        sairMenu.setOnClickListener {
            finish()
        }

        var queFacer = findViewById<TextView>(R.id.tvQueFacer)
        queFacer.setOnClickListener {
            val acceder = Intent(this, QueFacer::class.java)
            startActivity(acceder)
        }

        var gastronomia = findViewById<TextView>(R.id.tvGastronomia)
        gastronomia.setOnClickListener {
            val acceder = Intent(this, Gastronomia::class.java)
            startActivity(acceder)
        }
        var aloxamento = findViewById<TextView>(R.id.tvAloxamento)
        aloxamento.setOnClickListener {
            val acceder = Intent(this, Alojamiento::class.java)
            startActivity(acceder)
        }

        var picoSacro  = findViewById<TextView>(R.id.tvPicoSacro)
        picoSacro.setOnClickListener {
            val acceder = Intent(this, PicoSacro::class.java)
            startActivity(acceder)
        }

        var  festaFilloa= findViewById<TextView>(R.id.tvFestaFilloa)
        festaFilloa.setOnClickListener {
            val acceder = Intent(this, Filloa::class.java)
            startActivity(acceder)
        }

        var festasEFeiras = findViewById<TextView>(R.id.tvFestasEFeiras)
        festasEFeiras.setOnClickListener {
            val acceder = Intent(this, FestasEFeiras::class.java)
            startActivity(acceder)
        }

        var areasNaturais = findViewById<TextView>(R.id.tvAreasNaturais)
        areasNaturais.setOnClickListener {
            val acceder = Intent(this, AreasNaturais::class.java)
            startActivity(acceder)
        }

        var rutas = findViewById<TextView>(R.id.tvRutas)
        rutas.setOnClickListener {
            val acceder = Intent(this, Rutas::class.java)
            startActivity(acceder)
        }


        var contacta = findViewById<TextView>(R.id.tvContacta)
        contacta.setOnClickListener {
                val acceder = Intent(this, Contacta::class.java)
                startActivity(acceder)
            }

        var privacidade=findViewById<TextView>(R.id.tvLGPD)
        privacidade.setOnClickListener {
            startActivity(Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.gal/lopd/"))))
        }


    }
}