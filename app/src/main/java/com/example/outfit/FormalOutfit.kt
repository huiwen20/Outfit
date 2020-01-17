package com.example.outfit

import androidx.room.Entity

@Entity (tableName = "formalOutfit")
data class FormalOutfit (
    val image: Int,
    val imageType: String,
    val imageDesc: String
)