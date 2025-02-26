package com.imthiyas.quizapp.data

import retrofit2.http.GET
import retrofit2.http.Query

class QuizApi {
    @GET("api.php")
    suspend fun getQuestions(
        @Query("amount") amount:Int = 10,
        @Query("category") category: Int=18,
        @Query("type") type: String = "multiple"
    ):QuizResponse {
    }
}