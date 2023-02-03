package com.sazonov.fitnessclubapp.data.repository

import com.sazonov.fitnessclubapp.data.dto.ApiResponse
import com.sazonov.fitnessclubapp.data.dto.Result
import com.sazonov.fitnessclubapp.data.dto.Result.*
import com.sazonov.fitnessclubapp.data.remote.LessonsService
import com.sazonov.fitnessclubapp.domain.LessonEntity
import com.sazonov.fitnessclubapp.domain.LessonsRepository
import com.sazonov.fitnessclubapp.utils.Mapper
import retrofit2.HttpException
import retrofit2.Response

class LessonsRepositoryImpl(val service: LessonsService) : LessonsRepository {
    override suspend fun getLessons(): Result<List<LessonEntity>> {
        try {
            val response = service.getLessons()
            return Success(Mapper.apiResponseToEntityList(response.body()!!))
        } catch (exception: Exception) {
            return Error(exception)
        }

    }

}