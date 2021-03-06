package com.sajibthedev.planetinfoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlanetDetail : AppCompatActivity() {
    private lateinit var obj:PlanetInfo
    private  var plantImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_detail)

        obj = intent.getParcelableExtra("planet")!!
        plantImg = intent.getIntExtra("planetImage", -1)
        setData(obj, plantImg!!)

        val buttonInfo:TextView = findViewById(R.id.button_info)

        buttonInfo.setOnClickListener {
            startActivity(Intent(this, FinalActivity::class.java))
        }
    }

    private fun setData(obj:PlanetInfo, planetImg:Int) {
        val titleInfo:TextView = findViewById(R.id.title_info)
        val distanceInfo:TextView = findViewById(R.id.distance_info)
        val gravityInfo:TextView = findViewById(R.id.gravity_info)
        val overviewInfo:TextView = findViewById(R.id.overview_info)
        val planetImgInfo:ImageView = findViewById(R.id.planet_img_info)
        val galaxyInfo:TextView = findViewById(R.id.galaxy_info)

        titleInfo.text = obj.title
        distanceInfo.text = obj.distance + " km"
        gravityInfo.text = obj.gravity + " m/ss"
        overviewInfo.text = obj.overview
        planetImgInfo.setImageResource(planetImg)
        galaxyInfo.text = obj.galaxy

    }

}