package com.example.boqueixon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class PicoSacro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pico_sacro)

        var logoBoqueixon=findViewById<ImageButton>(R.id.imageButton2)
        logoBoqueixon.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        /*var menu=findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder= Intent(this, ::class.java)
            startActivity(acceder)
        }*/

        var iconoUbicacion= findViewById<ImageView>(R.id.imaxeLocalización)
        iconoUbicacion.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/dir//42.8068543,-8.4460329/@42.8067701,-8.4514426,15.75z")))
        }

        var accesoCentroInterpretacion=findViewById<ImageView>(R.id.imaxeCentroInterpretacion)
        accesoCentroInterpretacion.setOnClickListener {
            val acceder= Intent(this,CentroInterpretacion::class.java)
            startActivity(acceder)
        }

        var accesoMonteSagrado=findViewById<ImageView>(R.id.siluetaPico)
        accesoMonteSagrado.setOnClickListener {
            val acceder= Intent(this, MonteSagrado::class.java)
            startActivity(acceder)
        }
        var accesoDescargas=findViewById<ImageView>(R.id.descargas)
        accesoDescargas.setOnClickListener {
            val acceder= Intent(this, DescargasMultimedia::class.java)
            startActivity(acceder)
        }
    }
}