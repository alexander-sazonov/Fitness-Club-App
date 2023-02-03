package com.sazonov.fitnessclubapp.domain

import com.sazonov.fitnessclubapp.data.dto.Result

interface LessonsRepository {
   suspend fun getLessons(): Result<List<LessonEntity>>
}