package com.example.outfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LongActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_long)

        val linearLayout = findViewById(R.id.linearLayout4) as LinearLayout
        val recyclerView =  RecyclerView(this)

        val images = ArrayList<LongOutfit>()
        images.add(LongOutfit(R.drawable.image_casual, "Casual", "Long Skirt"))
        images.add(LongOutfit(R.drawable.image_dating4, "Dating", "Long Skirt"))
        images.add(LongOutfit(R.drawable.image_dinner1, "Dinner", "Long Skirt"))
        images.add(LongOutfit(R.drawable.image_dinner2, "Dinner", "Long Skirt"))
        images.add(LongOutfit(R.drawable.image_formal4, "Formal", "Long Skirt"))
        images.add(LongOutfit(R.drawable.image_casual2, "Casual", "Long Skirt"))
        images.add(LongOutfit(R.drawable.image_dating6, "Dating", "Long Skirt"))

        val adapter = LongOutfitAdapter(images)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        linearLayout.addView(recyclerView)

    }
}
