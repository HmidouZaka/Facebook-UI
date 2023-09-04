package com.projectbyzakaria.facebookui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory
import com.projectbyzakaria.facebookui.data.PostData
import com.projectbyzakaria.facebookui.ui.presintation.MainRepository
import com.projectbyzakaria.facebookui.ui.presintation.MainViewModel
import com.projectbyzakaria.facebookui.ui.screens.HomeScreen
import com.projectbyzakaria.facebookui.ui.theme.FacebookUITheme

class MainActivity : ComponentActivity() {

    val viewModel:MainViewModel by viewModels {
        object :ViewModelProvider.Factory{
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return MainViewModel(MainRepository(PostData())) as T
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FacebookUITheme {
                HomeScreen(
                    modifier = Modifier.fillMaxSize(),
                    viewModel = viewModel
                )
            }
        }
    }
}
