package com.zezzi.eventzezziapp.ui.meals.view

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zezzi.eventzezziapp.data.repository.MealsRepository
import kotlinx.coroutines.launch

class MealsCategoriesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {

    var categoryUiState by mutableStateOf(MealsCategoryUiState(emptyList()))
        private set
    var mealsUiState by mutableStateOf(MealsByCategoryUiState(emptyList()))
        private set

    fun getMeals() {
        categoryUiState = MealsCategoryUiState(emptyList(), loading = true)

        viewModelScope.launch {
            categoryUiState = MealsCategoryUiState(
                categories = repository.getMeals().categories
            )
        }
    }
    fun getMealsByCategory() {
        mealsUiState = MealsByCategoryUiState(emptyList(), loading = true)

        viewModelScope.launch {
            mealsUiState = MealsByCategoryUiState(
                meals = repository.getMealsByCategory().meals
            )
        }
    }
}