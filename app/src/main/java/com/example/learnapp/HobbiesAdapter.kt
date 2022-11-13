package com.example.learnapp

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView



class HobbiesAdapter(val context:Context, val hobbies:List<Hobby>):
    RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item , parent ,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun setData (hobby: Hobby?) {
            itemView.findViewById<TextView>(R.id.txvTitle).text= hobby!!.title
        }

    }

    }


