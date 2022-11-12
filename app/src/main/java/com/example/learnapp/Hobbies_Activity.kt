package com.example.learnapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class HobbiesActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        findViewById<RecyclerView>(R.id.recyclerView).layoutManager = layoutManager

        val adapter = HobbiesAdapter(this,Supplier.hobbies)
        findViewById<RecyclerView>(R.id.recyclerView).adapter = adapter


    }

}