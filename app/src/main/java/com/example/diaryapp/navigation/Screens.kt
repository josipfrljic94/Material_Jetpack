package com.example.diaryapp.navigation

sealed class Screen(val route: String) {
    object Auth : Screen(route = "auth_screen")
    object Home : Screen(route = "home_screen")
    object Write : Screen(route = "write_screen?diaryId={diaryId}") {
        fun passDiaryId(id: String) = "write_screen?diaryId=$id"

    }
}