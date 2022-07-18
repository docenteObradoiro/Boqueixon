package com.example.boqueixon.gastronomia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.boqueixon.MainActivity
import com.example.boqueixon.Menu
import com.example.boqueixon.R
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class Bares : AppCompatActivity() {
    val listaLestedo = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bares)

        val menu = findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder = Intent (this, Menu::class.java)
            startActivity(acceder)
        }


        val carruselLestedo: ImageCarousel = findViewById(R.id.carousel3)
        listaLestedo.add(CarouselItem(R.mipmap.barovinteseis))
        listaLestedo.add(CarouselItem(R.mipmap.barvikingo))



        carruselLestedo.addData(listaLestedo)

        carruselLestedo.showTopShadow = false
        carruselLestedo.showBottomShadow = false


    }
//    override fun ImageCarousel(){
//
//    }
}