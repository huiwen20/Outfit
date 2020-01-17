package com.example.outfit

import androidx.room.Entity

@Entity (tableName = "dinnerOutfit")
data class DinnerOutfit (
    val image: Int,
    val imageType: String,
    val imageDesc: String
)