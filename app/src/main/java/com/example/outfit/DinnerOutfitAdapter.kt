package com.example.outfit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.dinner_item.view.*

class DinnerOutfitAdapter (val imageList: ArrayList<DinnerOutfit>): RecyclerView.Adapter<DinnerOutfitAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItems(outfit:DinnerOutfit) {
            itemView.imageViewDinner.setImageResource(outfit.image)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DinnerOutfitAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.dinner_item, parent, false)

        return DinnerOutfitAdapter.ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: DinnerOutfitAdapter.ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
    }


}