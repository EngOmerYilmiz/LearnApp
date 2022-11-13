package com.example.learnapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<Button>(R.id.recyclerView)

       recyclerView.setOnClickListener{

           val intent = Intent(this,HobbiesActivity::class.java)

           startActivity(intent)

        }

        }
 }


