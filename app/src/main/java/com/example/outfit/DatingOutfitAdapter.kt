package com.example.outfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.casual_item.view.*
import kotlinx.android.synthetic.main.dating_item.view.*

class DatingOutfitAdapter (val imageList: ArrayList<DatingOutfit>): RecyclerView.Adapter<DatingOutfitAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.dating_item, parent, false)

        return DatingOutfitAdapter.ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit:DatingOutfit) {
            itemView.imageViewDating.setImageResource(outfit.image)
        }
    }
}