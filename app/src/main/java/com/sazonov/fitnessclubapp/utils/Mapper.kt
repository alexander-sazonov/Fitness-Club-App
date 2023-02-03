package com.sazonov.fitnessclubapp.utils

import com.sazonov.fitnessclubapp.data.dto.ApiResponse
import com.sazonov.fitnessclubapp.data.dto.CoachDto
import com.sazonov.fitnessclubapp.data.dto.LessonDto
import com.sazonov.fitnessclubapp.domain.LessonEntity

class Mapper {
    companion object {
        fun apiResponseToEntityList(apiResponse: ApiResponse): List<LessonEntity> {
            val lessonEntityList = ArrayList<LessonEntity>()
            val trainerList = apiResponse.trainers
            val lessonDtoList = apiResponse.lessons
            for (lessonDto in lessonDtoList) {
                val coach = trainerList.find { coachDto -> coachDto.id == lessonDto.coachId }
                val coachName = coach?.fullName ?: ""
                val lessonEntity = LessonEntity(
                    lessonDto.name,
                    lessonDto.description,
                    lessonDto.place,
                    coachName,
                    lessonDto.startTime,
                    lessonDto.endTime,
                    lessonDto.date
                )
                lessonEntityList.add(lessonEntity)
            }
            return lessonEntityList
        }
    }

}