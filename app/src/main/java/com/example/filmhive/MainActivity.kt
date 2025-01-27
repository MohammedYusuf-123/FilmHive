package com.example.filmhive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.filmhive.navigation.MovieNavigation
import com.example.filmhive.ui.theme.FilmHiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FilmHiveApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilmHiveApp() {
    FilmHiveTheme {
        MovieNavigation()
    }
}

@Preview(showSystemUi = true)
@Composable
fun FilmHive() {
    FilmHiveApp()
}