package com.example.boqueixon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageButton

class FeirasMercados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feiras_mercados)

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

        val botonLestedo = findViewById<ImageButton>(R.id.botonLestedo)
        botonLestedo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=campo%20da%20festa%20de%20lestedo&rlz=1C1VDKB_esES993ES993&oq=vampo+da+festa+de+lestedo&aqs=chrome..69i57j33i10i160l2j33i22i29i30l2.8808j0j4&sourceid=chrome&ie=UTF-8&tbs=lf:1,lf_ui:1&tbm=lcl&sxsrf=ALiCzsZjkiftMsy0ebUQxaH2UF2ySbG4xQ:1658140591899&rflfq=1&num=10&rldimm=14024601935408888238&lqi=ChljYW1wbyBkYSBmZXN0YSBkZSBsZXN0ZWRvSO6jzf73qoCACFopEAAQARACGAAYARgDGAQiGWNhbXBvIGRhIGZlc3RhIGRlIGxlc3RlZG-SAQpmYWlyZ3JvdW5kmgEgQ2hSRFNVaE5NRzluUzBWSlEwRm5TVU5YTWpVd1ZoQUKqARYQASoSIg5jYW1wbyBkYSBmZXN0YSgO&phdesc=DprbFBqBQzI&ved=2ahUKEwjWwd6Hn4L5AhUeRPEDHXWlANEQvS56BAgKEAE&sa=X&rlst=f#rlfi=hd:;si:14024601935408888238,l,ChljYW1wbyBkYSBmZXN0YSBkZSBsZXN0ZWRvSO6jzf73qoCACFopEAAQARACGAAYARgDGAQiGWNhbXBvIGRhIGZlc3RhIGRlIGxlc3RlZG-SAQpmYWlyZ3JvdW5kmgEgQ2hSRFNVaE5NRzluUzBWSlEwRm5TVU5YTWpVd1ZoQUKqARYQASoSIg5jYW1wbyBkYSBmZXN0YSgO,y,DprbFBqBQzI;mv:[[43.075218799999995,-8.0079434],[42.5401624,-8.7471721]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:1")))
        }

        val botonRodiño = findViewById<ImageButton>(R.id.botonRodino)
        botonRodiño.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/42%C2%B050'16.6%22N+8%C2%B026'17.5%22W/@42.8378925,-8.4394706,483m/data=!3m1!1e3!4m5!3m4!1s0x0:0x51a02557005bd691!8m2!3d42.8379444!4d-8.4381944?hl=es")))
        }
    }
}