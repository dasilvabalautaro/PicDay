package com.globalhiddenodds.picday.overview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.globalhiddenodds.picday.toolbox.Tools
import com.globalhiddenodds.picday.ui.screens.ImageScreen
import com.globalhiddenodds.picday.ui.theme.PicDayTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PicDayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImageScreen(date = Tools.formatDate())
                }
            }
        }
    }
}

