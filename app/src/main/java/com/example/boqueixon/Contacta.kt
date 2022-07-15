package com.example.boqueixon


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Contacta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacta)
        val logoBoqueixon = findViewById<ImageButton>(R.id.logoboqueixon)

        logoBoqueixon.setOnClickListener {
            val acceder = Intent(this, MainActivity::class.java)
            startActivity(acceder)}

        val equis= findViewById<ImageButton>(R.id.salir)
        equis.setOnClickListener {
            finish()
        }


        val texto=findViewById<EditText>(R.id.textoComentario)
        val button=findViewById<Button>(R.id.botonEnviar)
        val spinner=findViewById<Spinner>(R.id.spinner)
        val lista = arrayOf("Email", "SMS")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, lista)
        spinner.adapter = adaptador1
        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "Email" -> {
                    val intent = Intent(Intent.ACTION_SEND)
                    val recipients = arrayOf("INFO@BOQUEIXON.COM")
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients)
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Formulario de contacto aplicación turismo")
                    intent.putExtra(Intent.EXTRA_TEXT, "${texto.text.toString()}")
                    intent.type = "text/html"
                    intent.setPackage("com.google.android.gm")
                    startActivity(Intent.createChooser(intent, "Send mail"))
                }
                "SMS" -> {
                    val sms_uri = Uri.parse("smsto:+34 630 18 22 81")
                    val sms_intent = Intent(Intent.ACTION_SENDTO, sms_uri)
                    sms_intent.putExtra("sms_body", texto.text.toString())
                    startActivity(sms_intent)
                }
            }
        }

        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Concello+de+Boqueix%C3%B3n,+15881,+La+Coru%C3%B1a/@42.8127804,-8.4170029,17z/data=!3m1!4b1!4m5!3m4!1s0xd2fab9409373a69:0xa182d78e36c1a6da!8m2!3d42.8127765!4d-8.4148142")))
        }

        val botonTelefono = findViewById<ImageButton>(R.id.botonTelefono)
        botonTelefono.setOnClickListener {
            val phone = "tel: +34 630 18 22 81";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }
    }
}