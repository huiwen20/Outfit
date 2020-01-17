package com.example.outfit

import androidx.room.Entity

@Entity(tableName="casualOutfit")
data class CasualOutfit (
    val image: Int,
    val imageType: String,
    val imageDesc: String
)