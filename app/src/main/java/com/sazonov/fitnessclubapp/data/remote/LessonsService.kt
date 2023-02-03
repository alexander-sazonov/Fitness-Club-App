package com.sazonov.fitnessclubapp.data.remote

import com.sazonov.fitnessclubapp.data.dto.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

const val baseUrl = "https://olimpia.fitnesskit-admin.ru/"
interface LessonsService {

    @GET("schedule/get_v3/?club_id=2")
    fun getLessons(): Response<ApiResponse>
}