package com.example.composenavigation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.composenavigation.Screens
import com.example.composenavigation.navigation.Graph


@Composable
fun IntegroScreen(navController: NavController) {
    ScreenContent(text = "Integro Screen") {
        navController.navigate(Graph.MAIN)
    }
}