package com.example.boqueixon.gastronomia

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import com.example.boqueixon.MainActivity
import com.example.boqueixon.R
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class OndeComer : AppCompatActivity() {

    val listaLestedo = mutableListOf<CarouselItem>()
    val listaSergude = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onde_comer)

        val menu = findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder = Intent (this, com.example.boqueixon.Menu::class.java)
            startActivity(acceder)
        }


        val carruselLestedo: ImageCarousel = findViewById(R.id.carousel3)
        listaLestedo.add(CarouselItem(R.mipmap.restpulpfontes))
        listaLestedo.add(CarouselItem(R.mipmap.restviadaprata))
        listaLestedo.add(CarouselItem(R.mipmap.restapicotina))
        listaLestedo.add(CarouselItem(R.mipmap.restfachal))


        carruselLestedo.addData(listaLestedo)

        carruselLestedo.showTopShadow = false
        carruselLestedo.showBottomShadow = false

        val carruselSergude: ImageCarousel = findViewById(R.id.carousel4)
        listaSergude.add(CarouselItem(R.mipmap.resttabsanbenito))
        listaSergude.add(CarouselItem(R.mipmap.resttaboportugues))
        listaSergude.add(CarouselItem(R.mipmap.restcasacastro))
        listaSergude.add(CarouselItem(R.mipmap.restrosende))
        listaSergude.add(CarouselItem(R.mipmap.restparrilladaobreixo))
        listaSergude.add(CarouselItem(R.mipmap.restventevindo))

        carruselSergude.addData(listaSergude)

        carruselSergude.showTopShadow = false
        carruselSergude.showBottomShadow = false
    }


}