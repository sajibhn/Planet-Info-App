package com.sajibthedev.planetinfoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var planet: List<PlanetInfo>) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.title)
        var planet:ImageView = itemView.findViewById(R.id.planet_img)
        var galaxy: TextView = itemView.findViewById(R.id.title)
        var distance: TextView = itemView.findViewById(R.id.distance)
        var gravity: TextView = itemView.findViewById(R.id.gravity)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_sample_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].galaxy
        holder.distance.text = planet[position].distance
        holder.gravity.text = planet[position].galaxy

    }

    override fun getItemCount(): Int {
        return planet.size
    }
}