package com.example.diaryapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.diaryapp.presentation.screens.HomeScreen
import com.example.diaryapp.presentation.screens.auth.AuthScreen


@Composable
fun setupNavGraph(startDestination: String, navController: NavHostController) {
    NavHost(navController = navController, startDestination = startDestination) {
        authRoute()
        homeRoute()
//        writeRoute()
    }
}

fun NavGraphBuilder.authRoute() {
    composable(route = Screen.Auth.route) {

//        AuthScreen(loadingState = false, onButtonClicked = {
//            false
//        }, oneTapState = )
    }
}

fun NavGraphBuilder.homeRoute() {
    composable(route = Screen.Home.route) {

        HomeScreen()
    }
}
//fun NavGraphBuilder.writeRoute(){
//    composable(route="auth_screen", arguments = listOf(navArgument(name="diaryId"){
//        type= NavType.StringType
//        nullable = true
//    })){
//
//    }
//
//}