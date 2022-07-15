package com.example.boqueixon


import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.boqueixon.Alojamiento.Alojamiento
import androidx.appcompat.app.AlertDialog
import com.example.boqueixon.gastronomia.Gastronomia
import com.example.boqueixon.gastronomia.OndeComer


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var menu = findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }


        var buttonQueFacer = findViewById<Button>(R.id.buttonQueFacer)
        buttonQueFacer.setOnClickListener {
            val acceder = Intent(this, QueFacer::class.java)
            startActivity(acceder)
        }

        var accesoAlojamiento = findViewById<Button>(R.id.buttonAloxamento)
        accesoAlojamiento.setOnClickListener {
            val acceder = Intent(this, Alojamiento::class.java)
            startActivity(acceder)
        }

        var picoSacro = findViewById<Button>(R.id.buttonPicoSacro)
        picoSacro.setOnClickListener {
            val acceder = Intent(this, PicoSacro::class.java)
            startActivity(acceder)
        }

        var gastronomia = findViewById<Button>(R.id.buttonGastronomia)
        gastronomia.setOnClickListener {
            val acceder = Intent(this, Gastronomia::class.java)
            startActivity(acceder)
        }

        var folletoCastellano=findViewById<ImageView>(R.id.banderaEspana)
        folletoCastellano.setOnClickListener {
            startActivity(Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/contido/subidas/2018/08/folleto-ES-co%C3%B1ece-boqueixon-online.pdf"))))
        }

        var folletoGallego=findViewById<ImageView>(R.id.banderaGalicia)
        folletoGallego.setOnClickListener {
            startActivity(Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/contido/subidas/2018/08/folleto-GL-co%C3%B1ece-boqueixon.pdf"))))
        }

        var folletoIngles=findViewById<ImageView>(R.id.banderaUk)
        folletoIngles.setOnClickListener {
            startActivity(Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.com/contido/subidas/2018/08/folleto-EN-co%C3%B1ece-boqueixon-online.pdf"))))
        }

        var cookies=findViewById<TextView>(R.id.cookies)
        cookies.setOnClickListener {
            startActivity(Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.gal/politica-de-cookies/"))))
        }

        var privacidade=findViewById<TextView>(R.id.privacidad)
        privacidade.setOnClickListener {
            startActivity(Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.gal/lopd/"))))
        }

        var responsabilidad=findViewById<TextView>(R.id.responsabilidade)
        responsabilidad.setOnClickListener {
            startActivity(Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.gal/descargo-de-responsabilidad/"))))
        }

        var concello=findViewById<TextView>(R.id.webBoqueixon)
        concello.setOnClickListener {
            startActivity(Intent(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boqueixon.gal/"))))
        }
        }

    override fun onBackPressed() {
        myAlert(this)
    }

    fun myAlert(mContext: Context?) {

        val builder = AlertDialog.Builder(this, R.style.AlertTheme)
        builder.setTitle("Saír?")
        builder.setMessage("Queres saír da aplicación?")
        builder.setPositiveButton("Si")
        { dialogInterface, which ->
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent) }

        builder.setNegativeButton("Non", null)
        builder.show()
    }

}