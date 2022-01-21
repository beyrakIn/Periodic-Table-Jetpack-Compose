package com.squad.chemistry.screens

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import com.squad.chemistry.components.TopBar
import com.squad.chemistry.models.Element
import com.squad.chemistry.viewModels.MainViewModel

@Composable
fun ElementDetails(
    context: Context,
    navController: NavController,
    viewModel: MainViewModel,
    index: Int
) {
    val element = viewModel.elements[index]
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TopBar(title = element.name_en)
        Text(text = "Element ${element.name_en}")
    }
}