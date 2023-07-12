package com.example.composenavigation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ScreenContent(text: String, onNextScreen: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color(0xFF8BC34A))
                .clickable {

                }, contentAlignment = Alignment.Center
        ) {
            Text(text = text, fontSize = 20.sp, color = Color.White)
        }
        Button(
            modifier = Modifier
                .align(CenterHorizontally)
                .padding(top = 200.dp),
            onClick = { onNextScreen() }) {
            Text(text = "Next screen")
        }

//
    }
}

@Composable
@Preview(showBackground = true)
fun ScreenContentPreview() {
    ScreenContent("Hello world"){}
}