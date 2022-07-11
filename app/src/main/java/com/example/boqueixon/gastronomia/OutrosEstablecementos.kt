package com.example.boqueixon.gastronomia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.boqueixon.MainActivity
import com.example.boqueixon.R
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class OutrosEstablecementos : AppCompatActivity() {
    val listaLestedo = mutableListOf<CarouselItem>()
    val listaCamporrapado = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outros_establecementos)
        val menu = findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder = Intent (this, MainActivity::class.java)
            startActivity(acceder)
        }


        val carruselLestedo: ImageCarousel = findViewById(R.id.carousel3)
        listaLestedo.add(CarouselItem(R.mipmap.panaderiaofornodelestedo))
        listaLestedo.add(CarouselItem(R.mipmap.pasteleriabomboneriaelena))
        listaLestedo.add(CarouselItem(R.mipmap.tartaslestedo))


        carruselLestedo.addData(listaLestedo)

        carruselLestedo.showTopShadow = false
        carruselLestedo.showBottomShadow = false

        val carruselSergude: ImageCarousel = findViewById(R.id.carousel4)
        listaCamporrapado.add(CarouselItem(R.mipmap.panadariasancidre))
        listaCamporrapado.add(CarouselItem(R.mipmap.panaderiabodulce))

        carruselSergude.addData(listaCamporrapado)

        carruselSergude.showTopShadow = false
        carruselSergude.showBottomShadow = false
    }

}