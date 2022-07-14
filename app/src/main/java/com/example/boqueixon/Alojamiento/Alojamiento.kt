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
        albergueRainaLupa.add(CarouselItem(R.drawable.albergue_rai_a_lupa2))
        albergueRainaLupa.add(CarouselItem(R.drawable.albergue_rai_a_lupa_texto1))
        carruselAlbergueRainaLupa.addData(albergueRainaLupa)

        carruselAlbergueRainaLupa.showTopShadow = false
        carruselAlbergueRainaLupa.showBottomShadow = false

        val carruselCasaDeCasal:ImageCarousel= findViewById(R.id.carousel2)
        casaDeCasal.add(CarouselItem(R.drawable.casa_de_casal2))
        casaDeCasal.add(CarouselItem(R.drawable.casa_de_casal_texto1))
        carruselCasaDeCasal.addData(casaDeCasal)

        carruselCasaDeCasal.showTopShadow = false
        carruselCasaDeCasal.showBottomShadow = false

        val carruselCasaDeLamas:ImageCarousel= findViewById(R.id.carousel3)
        casaDeLamas.add(CarouselItem(R.drawable.casa_de_lamas2))
        casaDeLamas.add(CarouselItem(R.drawable.casa_de_lamas_texto1))
        carruselCasaDeLamas.addData(casaDeLamas)

        carruselCasaDeLamas.showTopShadow = false
        carruselCasaDeLamas.showBottomShadow = false

        val carruselMariaManuelaEnoturismo:ImageCarousel= findViewById(R.id.carousel4)
        mariaManuelaEnoturismo.add(CarouselItem(R.drawable.maria_manuela_enoturismo2))
        mariaManuelaEnoturismo.add(CarouselItem(R.drawable.maria_manuela_enoturismo_texto1))
        carruselMariaManuelaEnoturismo.addData(mariaManuelaEnoturismo)

        carruselMariaManuelaEnoturismo.showTopShadow = false
        carruselMariaManuelaEnoturismo.showBottomShadow = false

    }
}


