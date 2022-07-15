package com.example.boqueixon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class DescargasMultimedia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descargas_multimedia)

        var logoBoqueixon=findViewById<ImageButton>(R.id.imageButton2)
        logoBoqueixon.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        var menu=findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder= Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        var libro1= findViewById<TextView>(R.id.libro1)
        libro1.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/downloads/biblioteca/cova.do.pico.pdf")))
        }

        var folleto1= findViewById<TextView>(R.id.folleto1)
        folleto1.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/downloads/biblioteca/desplegable.pico.sacro.pdf")))
        }

        var folleto2= findViewById<TextView>(R.id.folleto2)
        folleto2.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/turismo2015/PicoSacro_GAL.pdf")))
        }

        var folleto3= findViewById<TextView>(R.id.folleto3)
        folleto3.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/turismo2015/Turismo_GAL.pdf")))
        }

        var folleto4= findViewById<TextView>(R.id.folleto4)
        folleto4.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/downloads/biblioteca/triptico.pico.sacro.gl.pdf")))
        }

        var video1= findViewById<TextView>(R.id.video1)
        video1.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/downloads/videos/video.pico.sacro.avi")))
        }

        var video2= findViewById<TextView>(R.id.video2)
        video2.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.antena3.com/especiales/noticias/rincon-ciudad/galicia/pico-sacro-monte-magico-galicia_2012011900097.html")))
        }
        var video3= findViewById<TextView>(R.id.video3)
        video3.setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/downloads/videos/Pico-Sacro.mp4")))
        }
    }
}