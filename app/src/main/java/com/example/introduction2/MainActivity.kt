package com.example.introduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.introduction.ui.theme.IntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroductionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("world")
                    ExerciseC()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntroductionTheme {
        Greeting("world")
    }
}

// Column 2 rows
@Composable
fun FlagLayout(modifier: Modifier = Modifier) {
    Column {
        Row(modifier = Modifier.fillMaxHeight(0.6f)) {
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth(0.4f)
            ){}
            Box(modifier = Modifier
                .background(Color.White)
                .fillMaxHeight()
                .fillMaxWidth(0.2f)
            ){}
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth()
            ){}
        }
        Box(modifier = Modifier
            .background(Color.White)
            .fillMaxHeight(0.1f)
            .fillMaxWidth()
        ){}
        Row {
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth(0.4f)
            ){}
            Box(modifier = Modifier
                .background(Color.White)
                .fillMaxHeight()
                .fillMaxWidth(0.2f)
            ){}
            Box(modifier = Modifier
                .background(Color.Red)
                .fillMaxHeight()
                .fillMaxWidth()
            ){}
        }

    }
}

@Composable
fun ExerciseA(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(Color.Yellow)
    ) {
        Text(
                text = "Hello Hello!!",
                modifier = Modifier
                    .background(Color.Red)
            )
        Text(
            text = "Hello Hello Again!!",
            modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "Hello Hello Again again my friend!!",
            modifier = Modifier
                .background(Color.Green)
        )


    }
}

@Composable
fun ExerciseB(modifier: Modifier = Modifier) {
    Column {
        Row(modifier = Modifier
            .fillMaxHeight(0.5f)
        ) {
            // CENTER
            Box(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.5f)
                .border(border = BorderStroke(2.dp, Color.Black)),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Center")
            }


            // TOP RIGHT
            Box(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .border(border = BorderStroke(2.dp, Color.Black)),
                contentAlignment = Alignment.TopEnd
            ){
                Text(text = "Top Right")
            }
        }
        Row {
            // BOTTOM
            Box(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.5f)
                .border(border = BorderStroke(2.dp, Color.Black)),
                contentAlignment = Alignment.BottomCenter
            ){
                Text(text = "Bottom")
            }

            // TOP LEFT
            Box(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .border(border = BorderStroke(2.dp, Color.Black)),
                contentAlignment = Alignment.TopStart
            ){
                Text(text = "Top Left")
            }
        }
    }
}

@Composable
fun ExerciseC(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxHeight(0.3f)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Box(modifier = Modifier
                .fillMaxWidth(0.5f),
                contentAlignment = Alignment.TopStart
            ) {
                Text(text = "Tlf. 51749269")
            }

            Box(modifier = Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ) {
                Text(text = "KEA IT-Arkitektur")
            }
        }

        Box(modifier = Modifier
            .fillMaxHeight(0.2f)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ane Novrup Larsen")
        }

        Box(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
        ) {
            Text(text = "Long long long long long long long long address")
        }
    }
}