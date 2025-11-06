package com.example.navigasiku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.navigasiku.ui.theme.NavigasiKuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigasiKuTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    DataApp(modifier = Modifier)
                }
            }
        }
    }
}
