package com.example.outfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShortActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_short)

        val linearLayout = findViewById(R.id.linearLayout5) as LinearLayout
        val recyclerView =  RecyclerView(this)

        val images = ArrayList<ShortOutfit>()
        images.add(ShortOutfit(R.drawable.image_casual5, "Casual","Short Skirt"))
        images.add(ShortOutfit(R.drawable.image_dating1, "Dating", "Short Skirt"))
        images.add(ShortOutfit(R.drawable.image_dating2, "Dating", "Short Skirt"))
        images.add(ShortOutfit(R.drawable.image_dating3, "Dating", "Short Skirt"))
        images.add(ShortOutfit(R.drawable.image_formal1, "Formal", "Short Skirt"))
        images.add(ShortOutfit(R.drawable.image_formal2, "Formal", "Short Skirt"))
        images.add(ShortOutfit(R.drawable.image_dinner3, "Dinner", "Short Skirt"))

        val adapter = ShortOutfitAdapter(images)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        linearLayout.addView(recyclerView)
    }
}
