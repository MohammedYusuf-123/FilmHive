package com.example.filmhive.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.filmhive.screens.home.HomeScreen
import com.example.filmhive.screens.details.DetailsScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name) {
        composable(route = MovieScreens.HomeScreen.name) {
            //Here we pass where it leads to
            HomeScreen(navController = navController)
        }
        composable(route = MovieScreens.DetailsScreen.name) {
            DetailsScreen(navController = navController)
        }
    }
}