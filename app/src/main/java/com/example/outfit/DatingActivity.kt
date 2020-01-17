package com.example.outfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DatingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dating)

        val linearLayout = findViewById(R.id.linearLayout1) as LinearLayout
        val recyclerView =  RecyclerView(this)

        val images = ArrayList<DatingOutfit>()
        images.add(DatingOutfit(R.drawable.image_dating, "Dating", "Short Skirt"))
        images.add(DatingOutfit(R.drawable.image_dating1, "Dating", "Short Skirt"))
        images.add(DatingOutfit(R.drawable.image_dating2, "Dating", "Short Skirt"))
        images.add(DatingOutfit(R.drawable.image_dating3, "Dating", "Short Skirt"))
        images.add(DatingOutfit(R.drawable.image_dating4, "Dating", "Long Skirt"))
        images.add(DatingOutfit(R.drawable.image_dating5, "Dating","Short Skirt"))
        images.add(DatingOutfit(R.drawable.image_dating6, "Dating", "Long Skirt"))

        val adapter = DatingOutfitAdapter(images)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        linearLayout.addView(recyclerView)
    }
}
