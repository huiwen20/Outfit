package com.example.outfit

import androidx.room.Entity

@Entity (tableName = "shortOutfit")
data class ShortOutfit (
    val image: Int,
    val imageType: String,
    val imageDesc: String
)