package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        recyclerView=findViewById(R.id.txt)

        val layotManager=LinearLayoutManager(this)
        layotManager.orientation=LinearLayoutManager.VERTICAL
        val adapter=ClothAdapterActivity()

        recyclerView.adapter=adapter
        recyclerView.layoutManager=layotManager
    }
}