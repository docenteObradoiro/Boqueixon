package com.example.boqueixon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.ImageButton
import com.example.boqueixon.FestasRelixiosas.data


        class RelixiosasVerbenas : AppCompatActivity() {
            private var expandableListView: ExpandableListView? = null
            private var adapter: ExpandableListAdapter? = null
            private var titleList: List<String>? = null

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_relixiosas_verbenas)
                title = "KotlinApp"
                expandableListView = findViewById(R.id.expendableList)
                if (expandableListView != null) {
                    val listData = data
                    titleList = ArrayList(listData.keys)
                    adapter = CustomExpandableListAdapter(this, titleList as ArrayList<String>, listData)
                    expandableListView!!.setAdapter(adapter)
                }

                var logoboqueixon = findViewById<ImageButton>(R.id.logoboqueixon)
                logoboqueixon.setOnClickListener {
                    val acceder = Intent(this, MainActivity::class.java)
                    startActivity(acceder)
                }

                var menu = findViewById<ImageButton>(R.id.menuHamburguesa2)
                menu.setOnClickListener {
                    val acceder = Intent(this, com.example.boqueixon.Menu::class.java)
                    startActivity(acceder)
                }
            }
        }


