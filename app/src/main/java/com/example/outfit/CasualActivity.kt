package com.example.outfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CasualActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_casual)

        val linearLayout = findViewById(R.id.linearLayout) as LinearLayout
        val recyclerView =  RecyclerView(this)

        val images = ArrayList<CasualOutfit>()
        images.add(CasualOutfit(R.drawable.image_casual, "Casual", "Long Skirt"))
        images.add(CasualOutfit(R.drawable.image_casual1, "Casual", " "))
        images.add(CasualOutfit(R.drawable.image_casual2, "Casual", "Long Skirt"))
        images.add(CasualOutfit(R.drawable.image_casual3, "Casual", " "))
        images.add(CasualOutfit(R.drawable.image_casual4, "Casual", " "))
        images.add(CasualOutfit(R.drawable.image_casual5, "Casual","Short Skirt"))
        images.add(CasualOutfit(R.drawable.image_casual6, "Casual", "Long Skirt"))
        images.add(CasualOutfit(R.drawable.image_casual7, "Casual", " "))

        val adapter = CasualOutfitAdapter(images)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        linearLayout.addView(recyclerView)

    }
}
