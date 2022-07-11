package com.example.boqueixon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MonteSagrado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monte_sagrado)

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

        var iconoTren= findViewById<TextView>(R.id.distanciaTren)
        iconoTren.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/d/u/0/viewer?ie=UTF8&hl=es&msa=0&t=h&z=17&mid=1RM2PatCchnINRmlZ01fqqw59rk0&ll=42.87067253379571%2C-8.54374049999999")))
        }
        var iconoBus= findViewById<TextView>(R.id.distanciaBus)
        iconoBus.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/d/u/0/viewer?ie=UTF8&hl=es&msa=0&t=h&z=17&mid=1RM2PatCchnINRmlZ01fqqw59rk0&ll=42.87067253379571%2C-8.54374049999999")))
        }
        var iconoAvion= findViewById<TextView>(R.id.distanciaAeroporto)
        iconoAvion.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/d/u/0/viewer?ie=UTF8&t=m&source=embed&oe=UTF8&msa=0&mid=15KV8VpFfq_BbYfkvgOLj1YqYUDg&ll=42.89798299999999%2C-8.420751999999995&z=17")))
        }
    }
}