package com.example.outfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dinner_item.view.*
import kotlinx.android.synthetic.main.formal_item.view.*

class FormalOutfitAdapter (val imageList: ArrayList<FormalOutfit>): RecyclerView.Adapter<FormalOutfitAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit:FormalOutfit) {
            itemView.imageViewFormal.setImageResource(outfit.image)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FormalOutfitAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.formal_item, parent, false)

        return FormalOutfitAdapter.ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

}