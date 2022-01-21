package com.squad.chemistry.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.squad.chemistry.models.Element


@Composable
fun ElementCard(element: Element, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp, 4.dp)
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(12.dp), elevation = 4.dp
    ) {
        Row(
            Modifier
                .padding(4.dp)
                .fillMaxSize()
        ) {

            ElementWidget(
                number = element.number,
                name = element.name_en,
                symbol = element.symbol
            )

            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .padding(6.dp)
                    .fillMaxHeight()
                    .weight(0.8f)
            ) {
                Text(
                    text = element.name_en,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 20.sp),
                    color = Color.Black,
                    maxLines = 1
                )
                Text(
                    text = element.named_by,
                    style = MaterialTheme.typography.caption,
                )
                Text(
                    text = element.description,
                    style = MaterialTheme.typography.body2,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )

            }
        }

    }

}