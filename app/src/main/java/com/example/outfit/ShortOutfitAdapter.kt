package com.example.outfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.casual_item.view.*
import kotlinx.android.synthetic.main.short_item.view.*

class ShortOutfitAdapter (val imageList: ArrayList<ShortOutfit>): RecyclerView.Adapter<ShortOutfitAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShortOutfitAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.short_item, parent, false)

        return ShortOutfitAdapter.ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit:ShortOutfit) {
            itemView.imageViewShort.setImageResource(outfit.image)
        }
    }
}