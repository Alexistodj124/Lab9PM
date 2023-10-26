package com.zezzi.eventzezziapp.ui.meals.view

import com.zezzi.eventzezziapp.data.networking.response.MealResponse
import com.zezzi.eventzezziapp.data.networking.response.Meals

data class MealsCategoryUiState(
    val categories: List<MealResponse>,
    val loading: Boolean = false,
)
data class MealsByCategoryUiState(
    val meals: List<Meals>,
    val loading: Boolean = false
)