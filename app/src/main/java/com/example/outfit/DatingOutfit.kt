package com.example.outfit

import androidx.room.Entity

@Entity (tableName = "datingOutfit")
data class DatingOutfit (
    val image: Int,
    val imageType: String,
    val imageDesc: String
)