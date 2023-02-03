package com.sazonov.fitnessclubapp.domain

import java.time.LocalDate

data class LessonEntity(
    val name: String,
    val description: String,
    val place: String,
    val coachName: String,
    val startTime: String,
    val endTime: String,
    val date: LocalDate
)