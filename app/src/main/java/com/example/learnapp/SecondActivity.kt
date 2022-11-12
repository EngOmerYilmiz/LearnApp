package com.example.learnapp

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle? = intent.extras

        val message = bundle!!.getString("my age")

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

        val textShow = findViewById<TextView>(R.id.textView2)

        textShow.text = "hello buddy! you're now $message!"


    }

}