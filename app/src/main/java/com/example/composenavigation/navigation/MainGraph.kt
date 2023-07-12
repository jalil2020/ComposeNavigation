package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composenavigation.Screens
import com.example.composenavigation.screen.FavoriteScreen
import com.example.composenavigation.screen.HomeScreen
import com.example.composenavigation.screen.ProfileScreen
import com.example.composenavigation.screen.TableScreen


@Composable
fun MainGraph(navController: NavHostController) {
    NavHost(
        route = Graph.MAIN,
        navController = navController,
        startDestination = Graph.HOME
    ) {


        homeNavGraph(navController)


        composable(BottomNavItem.TableScreen.screen_route) {
            TableScreen()
        }
        composable(BottomNavItem.FavoriteScreen.screen_route) {
            FavoriteScreen()
        }
        composable(BottomNavItem.ProfileScreen.screen_route) {
            ProfileScreen()
        }
    }

}

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {
    navigation(route = Graph.HOME, startDestination = BottomNavItem.HomeScreen.screen_route) {
        composable(BottomNavItem.HomeScreen.screen_route) {
            HomeScreen() { destination ->
                navController.navigate(destination)
            }
        }
        composable(Screens.IntegroScreen.route) {
            ProfileScreen()
        }
    }
}