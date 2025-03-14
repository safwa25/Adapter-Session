package com.safwa.adaptersession

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
//Class without ViewHolder
//class MyAdapter(
//    private val context: Context,
//    private val array: Array<String>,
//    private val images: Array<Int>
//) : ArrayAdapter<String>(context, R.layout.row, array) {
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val row: View = LayoutInflater.from(context).inflate(R.layout.row, parent, false)
//        val textView = row.findViewById<TextView>(R.id.textView)
//        Log.d("Safwa","Inflate again")
//        val image=row.findViewById<ImageView>(R.id.imageView)
//        textView.text = array[position]
//        image.setImageResource(images[position])
//        return row
//    }
//}
class MyAdapter( context: Context,val array: Array<String>,val images:Array<Int>):ArrayAdapter<Any?>(context,R.layout.row,array){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var rowView:View? =convertView
        val viewHolder:ViewHolder
        if (rowView==null){
            rowView= LayoutInflater.from(context).inflate(R.layout.row,parent,false)
            viewHolder=ViewHolder(rowView)
            rowView.tag=viewHolder
            Log.d("Safwa","First inflation")

        }else{
            viewHolder=rowView.tag as ViewHolder
            Log.d("Safwa","reuse")

        }


        viewHolder.getText()?.text=array[position]
        viewHolder.getImage()?.setImageResource(images[position])
        return rowView !!
    }
    class ViewHolder(var view:View){
        private var textView:TextView?=null
        private var imageView:ImageView?=null

        fun getText():TextView?{
            return textView?:view.findViewById(R.id.textView)
        }
        fun getImage():ImageView?{
            return imageView?:view.findViewById(R.id.imageView)
        }

    }
}
