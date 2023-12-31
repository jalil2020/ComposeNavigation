package com.example.composenavigation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.composenavigation.R
import com.example.composenavigation.Screens

@Composable
fun HomeScreen(onClick:(String)->Unit) {
    ScreenContent("Home") {
        onClick(Screens.IntegroScreen.route)
    }
}



@Composable
fun TableScreen() {
    ScreenContent(text = "Table") {

    }
}

@Composable
fun FavoriteScreen() {
    ScreenContent(text = "Favorite") {

    }
}


@Composable
fun ProfileScreen() {
    ScreenContent(text = "Profile") {

    }
}
