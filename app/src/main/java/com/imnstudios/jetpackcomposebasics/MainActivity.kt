package com.imnstudios.jetpackcomposebasics

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.imnstudios.jetpackcomposebasics.ui.theme.CraneTheme
import com.imnstudios.jetpackcomposebasics.ui.views.ImageCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CraneTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    // ctrl+p to show parameters of a method, do inside parenthesis
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello")
        Text(text = "$name!")

        Spacer(modifier = Modifier.height(20.dp))

        val painter = painterResource(id = R.drawable.nitheesh)
        val description = "Nitheesh is a legend!"
        val title = "Nitheesh"
        Box(modifier = Modifier.fillMaxWidth(0.5f)) {
            ImageCard(painter = painter, contentDescription = description, title)
        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CraneTheme {
        Greeting("Android")
    }
}