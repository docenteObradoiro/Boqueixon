package com.example.boqueixon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.boqueixon.gastronomia.Gastronomia
import com.example.boqueixon.gastronomia.OndeComer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gastronomia = findViewById<Button>(R.id.buttonGastronomia)
        gastronomia.setOnClickListener {
            val acceder = Intent (this, Gastronomia::class.java)
            startActivity(acceder)
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