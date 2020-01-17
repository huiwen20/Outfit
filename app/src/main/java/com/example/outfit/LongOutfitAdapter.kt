package com.example.outfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.casual_item.view.*
import kotlinx.android.synthetic.main.long_item.view.*

class LongOutfitAdapter (val imageList: ArrayList<LongOutfit>): RecyclerView.Adapter<LongOutfitAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LongOutfitAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.long_item, parent, false)

        return LongOutfitAdapter.ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit:LongOutfit) {
            itemView.imageViewLong.setImageResource(outfit.image)
        }
    }
}