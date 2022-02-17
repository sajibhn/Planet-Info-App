package com.sajibthedev.planetinfoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myRecycler:RecyclerView = findViewById(R.id.my_recycler)
        myRecycler.adapter = Adapter(SetData.setPlanets())
        myRecycler.layoutManager = LinearLayoutManager(this)



    }
}