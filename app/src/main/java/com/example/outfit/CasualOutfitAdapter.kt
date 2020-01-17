package com.example.outfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.casual_item.view.*

class CasualOutfitAdapter (val imageList: ArrayList<CasualOutfit>): RecyclerView.Adapter<CasualOutfitAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit:CasualOutfit) {
            itemView.imageViewCasual.setImageResource(outfit.image)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CasualOutfitAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.casual_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: CasualOutfitAdapter.ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
    }

}