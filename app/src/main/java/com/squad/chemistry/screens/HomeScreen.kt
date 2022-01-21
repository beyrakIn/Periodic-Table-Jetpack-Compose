package com.squad.chemistry.screens

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.squad.chemistry.R
import com.squad.chemistry.components.ElementCard
import com.squad.chemistry.components.TopBar
import com.squad.chemistry.utils.Screen
import com.squad.chemistry.viewModels.MainViewModel

@Composable
fun HomeScreen(context: Context, navController: NavController, viewModel: MainViewModel) {

    Column {
        TopBar("Periodic Table")
        LazyColumn {
            items(viewModel.elements.size) { item ->
                ElementCard(element = viewModel.elements[item]) {
                    try {
                        navController.navigate(Screen.ElementDetails.route + "/" + item)
                    } catch (e: Exception) {
                        println(e.message)
                    }
                }
            }
        }

    }
}