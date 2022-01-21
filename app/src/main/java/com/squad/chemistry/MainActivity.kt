package com.squad.chemistry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.squad.chemistry.ui.theme.PeriodicTableTheme
import com.squad.chemistry.utils.Navigation
import com.squad.chemistry.viewModels.MainViewModel

class MainActivity : ComponentActivity() {
    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PeriodicTableTheme {
//                HomeScreen(context = this, viewModel = viewModel)
                Navigation(context = this, viewModel = viewModel)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PeriodicTableTheme {
    }
}