package com.example.outfit

import androidx.room.Entity

@Entity (tableName = "longOutfit")
data class LongOutfit (
    val image: Int,
    val imageType: String,
    val imageDesc: String
)