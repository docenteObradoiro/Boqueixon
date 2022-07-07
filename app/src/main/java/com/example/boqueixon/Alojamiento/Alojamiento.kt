package com.example.boqueixon.Alojamiento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


        val carruselAlbergueRainaLupa:ImageCarousel= findViewById(R.id.carousel1)
        albergueRainaLupa.add(CarouselItem(R.drawable.logoboqueixon))
        albergueRainaLupa.add(CarouselItem(R.drawable.logoboqueixon))
        carruselAlbergueRainaLupa.addData(albergueRainaLupa)

        carruselAlbergueRainaLupa.showTopShadow = false
        carruselAlbergueRainaLupa.showBottomShadow = false

        val carruselCasaDeCasal:ImageCarousel= findViewById(R.id.carousel2)
        casaDeCasal.add(CarouselItem(R.drawable.logoboqueixon))
        casaDeCasal.add(CarouselItem(R.drawable.logoboqueixon))
        carruselCasaDeCasal.addData(casaDeCasal)

        carruselCasaDeCasal.showTopShadow = false
        carruselCasaDeCasal.showBottomShadow = false

        val carruselCasaDeLamas:ImageCarousel= findViewById(R.id.carousel3)
        casaDeLamas.add(CarouselItem(R.drawable.logoboqueixon))
        casaDeLamas.add(CarouselItem(R.drawable.logoboqueixon))
        carruselCasaDeLamas.addData(casaDeLamas)

        carruselCasaDeLamas.showTopShadow = false
        carruselCasaDeLamas.showBottomShadow = false

        val carruselMariaManuelaEnoturismo:ImageCarousel= findViewById(R.id.carousel4)
        mariaManuelaEnoturismo.add(CarouselItem(R.drawable.logoboqueixon))
        mariaManuelaEnoturismo.add(CarouselItem(R.drawable.logoboqueixon))
        carruselMariaManuelaEnoturismo.addData(mariaManuelaEnoturismo)

        carruselMariaManuelaEnoturismo.showTopShadow = false
        carruselMariaManuelaEnoturismo.showBottomShadow = false

    }
}


