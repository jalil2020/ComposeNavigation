package com.example.composenavigation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.composenavigation.Screens


@Composable
fun IntegroScreen(navController: NavHostController) {
    ScreenContent(text = "Integro Screen") {
        navController.navigate(Screens.MainContainerScreen.route)
    }
}