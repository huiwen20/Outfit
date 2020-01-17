package com.example.outfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.casual_item.view.*

class ShortOutfitAdapter (val imageList: ArrayList<ShortOutfit>): RecyclerView.Adapter<ShortOutfitAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ShortOutfitAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.short_item, parent, false)

        return ShortOutfitAdapter.ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit:ShortOutfit) {
            itemView.imageViewCasual.setImageResource(outfit.image)
        }
    }
}