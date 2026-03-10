package com.example.composecarrot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.composecarrot.ui.component.MainPage
import com.example.composecarrot.ui.theme.ComposeCarrotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeCarrotTheme {
                MainPage()
            }
        }
    }
}
