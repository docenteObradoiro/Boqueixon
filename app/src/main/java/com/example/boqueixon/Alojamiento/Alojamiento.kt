package com.example.boqueixon.Alojamiento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.boqueixon.MainActivity
import com.example.boqueixon.Menu
import com.example.boqueixon.R
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class Alojamiento : AppCompatActivity() {

    val albergueRainaLupa = mutableListOf<CarouselItem>()
    val casaDeCasal = mutableListOf<CarouselItem>()
    val casaDeLamas = mutableListOf<CarouselItem>()
    val mariaManuelaEnoturismo = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alojamiento)

        val carruselCasaDeCasal:ImageCarousel= findViewById(R.id.carousel1)
        casaDeCasal.add(CarouselItem(R.drawable.casa_de_casal3))
        casaDeCasal.add(CarouselItem(R.drawable.casa_de_casal_texto3))
        carruselCasaDeCasal.addData(casaDeCasal)

        carruselCasaDeCasal.showTopShadow = false
        carruselCasaDeCasal.showBottomShadow = false

        val carruselMariaManuelaEnoturismo:ImageCarousel= findViewById(R.id.carousel2)
        mariaManuelaEnoturismo.add(CarouselItem(R.drawable.maria_manuela_enoturismo3))
        mariaManuelaEnoturismo.add(CarouselItem(R.drawable.maria_manuela_enoturismo_texto3))
        carruselMariaManuelaEnoturismo.addData(mariaManuelaEnoturismo)

        carruselMariaManuelaEnoturismo.showTopShadow = false
        carruselMariaManuelaEnoturismo.showBottomShadow = false

        val carruselAlbergueRainaLupa:ImageCarousel= findViewById(R.id.carousel3)
        albergueRainaLupa.add(CarouselItem(R.drawable.albergue_rai_a_lupa3))
        albergueRainaLupa.add(CarouselItem(R.drawable.albergue_rai_a_lupa_texto3))
        carruselAlbergueRainaLupa.addData(albergueRainaLupa)

        carruselAlbergueRainaLupa.showTopShadow = false
        carruselAlbergueRainaLupa.showBottomShadow = false

        val carruselCasaDeLamas:ImageCarousel= findViewById(R.id.carousel4)
        casaDeLamas.add(CarouselItem(R.drawable.casa_de_lamas3))
        casaDeLamas.add(CarouselItem(R.drawable.casa_de_lamas_texto3))
        carruselCasaDeLamas.addData(casaDeLamas)

        carruselCasaDeLamas.showTopShadow = false
        carruselCasaDeLamas.showBottomShadow = false

        var menu = findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        var logoboqueixon=findViewById<ImageButton>(R.id.imageButton2)
        logoboqueixon.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
    }
}


