package com.sajibthedev.planetinfoapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class Adapter(private var  planet: List<PlanetInfo>) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.title)
        var planetimg:ImageView = itemView.findViewById(R.id.planet_img)
        var galaxy: TextView = itemView.findViewById(R.id.galaxy)
        var distance: TextView = itemView.findViewById(R.id.distance)
        var gravity: TextView = itemView.findViewById(R.id.gravity)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_sample_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].galaxy
        holder.distance.text = planet[position].distance + " km"
        holder.gravity.text = planet[position].galaxy + " m/ss"

        holder.itemView.setOnClickListener {
            val intent  = Intent(holder.itemView.context, PlanetDetail::class.java)
            intent.putExtra("planet", planet[position])
            intent.putExtra("planetImage", dummyImage)
            holder.itemView.context.startActivity(intent)
        }

        when(planet[position].title!!.lowercase(Locale.getDefault())){

            "mars" -> {
                dummyImage = R.drawable.ic_mars
            }

            "neptune" -> {
                dummyImage = R.drawable.ic_neptune
            }

            "earth" -> {
                dummyImage = R.drawable.ic_earth
            }

            "moon" -> {
                dummyImage = R.drawable.ic_moon
            }

            "venus" -> {
                dummyImage = R.drawable.ic_venus
            }

            "jupiter" -> {
                dummyImage = R.drawable.ic_jupiter
            }

            "saturn" -> {
                dummyImage = R.drawable.ic_saturn
            }

            "uranus" -> {
                dummyImage = R.drawable.ic_uranus
            }

            "mercury" -> {
                dummyImage = R.drawable.ic_mercury
            }

            "sun" -> {
                dummyImage = R.drawable.ic_sun
            }
        }
        holder.planetimg.setImageResource(dummyImage!!)




    }

    override fun getItemCount(): Int {
        return planet.size
    }
}