package com.example.outfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner)

        val linearLayout = findViewById(R.id.linearLayout2) as LinearLayout
        val recyclerView =  RecyclerView(this)

        val images = ArrayList<DinnerOutfit>()
        images.add(DinnerOutfit(R.drawable.image_dinner, "Dinner", "Short Skirt"))
        images.add(DinnerOutfit(R.drawable.image_dinner1, "Dinner", "Long Skirt"))
        images.add(DinnerOutfit(R.drawable.image_dinner2, "Dinner", "Long Skirt"))
        images.add(DinnerOutfit(R.drawable.image_dinner3, "Dinner", "Short Skirt"))
        images.add(DinnerOutfit(R.drawable.image_dinner4, "Dinner", "Long Skirt"))
        images.add(DinnerOutfit(R.drawable.image_dinner5, "Dinner","Long Skirt"))
        images.add(DinnerOutfit(R.drawable.image_dinner6, "Dinner", "Long Skirt"))

        val adapter = DinnerOutfitAdapter(images)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        linearLayout.addView(recyclerView)

    }
}
