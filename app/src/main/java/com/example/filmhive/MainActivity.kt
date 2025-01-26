package com.example.filmhive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = { Text(text = "Movies") },
                    colors = TopAppBarDefaults.topAppBarColors(Color.LightGray)
                )
            }
        ) { innerPadding ->
            MainContent(Modifier.padding(innerPadding))
        }
    }
}

@Composable
fun MainContent(modifier: Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Text(text = "Hello FlimHive")
    }
}

@Preview(showSystemUi = true)
@Composable
fun FilmHive() {
    FilmHiveApp()
}