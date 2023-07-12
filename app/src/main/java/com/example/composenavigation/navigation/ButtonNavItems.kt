package com.example.composenavigation.navigation

import com.example.composenavigation.R

sealed class BottomNavItem(var title: String, var icon: Int, var screen_route: String) {
    object HomeScreen : BottomNavItem("Home", R.drawable.ic_home, "home_screen")
    object TableScreen : BottomNavItem("Table", R.drawable.ic_my_network, "table_screen")
    object FavoriteScreen : BottomNavItem("Favorite", R.drawable.ic_post, "favorite_screen")
    object ProfileScreen : BottomNavItem("Profile", R.drawable.ic_notification, "profile_screen")
}