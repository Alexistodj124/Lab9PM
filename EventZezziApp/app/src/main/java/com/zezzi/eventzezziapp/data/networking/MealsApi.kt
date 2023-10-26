package com.zezzi.eventzezziapp.data.networking

import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
import com.zezzi.eventzezziapp.data.networking.response.MealsResponse
import retrofit2.http.GET



interface MealsApi {
    @GET("categories.php")
    suspend fun getMeals(): MealsCategoriesResponse

    @GET("filter.php?c=Seafood")
    suspend fun getMealsByCategory(): MealsResponse
}