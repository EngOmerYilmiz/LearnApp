package com.example.learnapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shareBtn = findViewById<Button>(R.id.clickButton)


        shareBtn.setOnClickListener{

            val message:String = findViewById<EditText>(R.id.msgView).text.toString()


            val intent = Intent()

            intent.action = Intent.ACTION_SEND

            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Share to:"))

        }

       findViewById<Button>(R.id.recylerBtn).setOnClickListener{

           val intent = Intent(this,HobbiesActivity::class.java)

           startActivity(intent)

        }


        }
 }


