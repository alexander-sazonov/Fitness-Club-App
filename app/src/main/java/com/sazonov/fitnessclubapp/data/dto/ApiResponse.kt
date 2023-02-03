package com.sazonov.fitnessclubapp.data.dto

import com.sazonov.fitnessclubapp.data.dto.CoachDto
import com.sazonov.fitnessclubapp.data.dto.LessonDto
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val trainers: List<CoachDto>,
    val lessons: List<LessonDto>
)
