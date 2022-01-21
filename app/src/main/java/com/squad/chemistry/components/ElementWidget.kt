package com.squad.chemistry.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ElementWidget(number: Number, name: String, symbol: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
    ) {
        Text(
            text = number.toString(),
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontSize = 13.sp),
            color = Color.Black,
            maxLines = 1
        )
        Text(
            text = symbol,
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontSize = 40.sp),
            color = Color.Black,
            maxLines = 1
        )
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontSize = 10.sp),
            color = Color.Black,
            maxLines = 1
        )


    }

}