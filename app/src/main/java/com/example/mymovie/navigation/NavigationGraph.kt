package com.example.mymovie.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mymovie.AboutScreen
import com.example.mymovie.DetailScreen
import com.example.mymovie.GridScreen
import com.example.mymovie.HomeScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("grid") {
            GridScreen(navController)
        }
        composable("about") {
            AboutScreen(navController)
        }
        composable(Screen.Detail.route)
        { DetailScreen(navController = navController) }
    }
}