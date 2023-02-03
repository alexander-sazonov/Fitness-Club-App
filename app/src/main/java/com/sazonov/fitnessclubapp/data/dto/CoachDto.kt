package com.sazonov.fitnessclubapp.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoachDto(
    val id: String,
    @SerialName("full_name")
    val fullName: String,
    val position: String,
    @SerialName("image_url")
    val imageUrl: String
)
