package com.example.boqueixon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageButton
import android.widget.TextView

class AreasNaturais : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areas_naturais)

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

        var mapsAreaRecreativaGastrar=findViewById<TextView>(R.id.textView4)
        mapsAreaRecreativaGastrar.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/q5K2JXsb6BowLzx4A")))
        }

        var mapsAreaRecreativaIllasGres=findViewById<TextView>(R.id.textView6)
        mapsAreaRecreativaIllasGres.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/Kmxh5T8WvYH4stmH8")))
        }

        var mapsAreaRecreativaSucira=findViewById<TextView>(R.id.textView8)
        mapsAreaRecreativaSucira.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/wDzY8CG4DRUH4cqG8")))
        }

        var mapsAreaRecreativaCapelaSanPaio=findViewById<TextView>(R.id.textView10)
        mapsAreaRecreativaCapelaSanPaio.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/3s26oF77czDYVRk86")))
        }
    }
}