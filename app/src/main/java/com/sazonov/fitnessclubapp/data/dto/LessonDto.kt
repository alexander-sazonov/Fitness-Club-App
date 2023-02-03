package com.sazonov.fitnessclubapp.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.time.LocalDate

@Serializable
data class LessonDto(
    val name: String,
    val description: String,
    val place: String,
    @SerialName("coach_id")
    val coachId: String,
    val startTime: String,
    val endTime: String,
    @Serializable(with = LocalDateAsStringSerializer::class)
    val date: LocalDate
)