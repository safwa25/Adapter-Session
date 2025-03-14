package com.safwa.adaptersession

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val list: List<Number>):RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>(){
    class viewHolder(row: View):RecyclerView.ViewHolder(row){
        val text=row.findViewById<TextView>(R.id.textView)
        val image:ImageView=row.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layot=LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return viewHolder(layot)
    }

    override fun getItemCount(): Int =list.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
       holder.text.text=list[position].text
        holder.image.setImageResource(list[position].image)
    }

}