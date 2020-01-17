package com.example.outfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FormalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formal)

        val linearLayout = findViewById(R.id.linearLayout3) as LinearLayout
        val recyclerView =  RecyclerView(this)

        val images = ArrayList<FormalOutfit>()
        images.add(FormalOutfit(R.drawable.image_formal, "Formal", " "))
        images.add(FormalOutfit(R.drawable.image_formal1, "Formal", "Short Skirt"))
        images.add(FormalOutfit(R.drawable.image_formal2, "Formal", "Short Skirt"))
        images.add(FormalOutfit(R.drawable.image_formal3, "Formal", " "))
        images.add(FormalOutfit(R.drawable.image_formal4, "Formal", "Long Skirt"))
        images.add(FormalOutfit(R.drawable.image_formal5, "Formal"," "))
        images.add(FormalOutfit(R.drawable.image_formal6, "Formal", " "))

        val adapter = FormalOutfitAdapter(images)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        linearLayout.addView(recyclerView)

    }
}
