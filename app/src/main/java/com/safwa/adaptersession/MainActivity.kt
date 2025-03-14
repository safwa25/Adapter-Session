package com.safwa.adaptersession

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

val listContent=arrayOf("one","two","three","four","five","six","seven")
val images= arrayOf(R.drawable.one,
    R.drawable.two,
    R.drawable.three,
    R.drawable.four,
    R.drawable.five,
    R.drawable.six,
    R.drawable.seven
    )
val numberList: List<Number> = listOf(
    Number("one", R.drawable.one),
    Number("two", R.drawable.two),
    Number("three", R.drawable.three),
    Number("four", R.drawable.four),
    Number("five", R.drawable.five),
    Number("six", R.drawable.six),
    Number("seven", R.drawable.seven)
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//List View code
//        val adapter : ArrayAdapter<String> =
//            ArrayAdapter(this,R.layout.row,R.id.textView, listContent)
//        val listView:ListView=findViewById(R.id.list_view)
//        listView.adapter=MyAdapter(this, listContent, images)
//        listView.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this,"it is ${listView.getItemAtPosition(position)}",Toast.LENGTH_SHORT).show()
//        }
        val recyclerView:RecyclerView=findViewById(R.id.Recycler)
        val layotManage=LinearLayoutManager(this)
        recyclerView.adapter=RecyclerViewAdapter(numberList)
        recyclerView.layoutManager=layotManage



    }
}