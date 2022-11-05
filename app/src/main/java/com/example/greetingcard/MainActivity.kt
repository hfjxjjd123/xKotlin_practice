package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //do
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.DarkGray
                ) {
                    HappyBirthdayColumn(name = "Hakrim")
                }
            }
        }
    }
}

@Composable
fun HappyBirthdayText(){
    Text(text = "Happy Birthday!!!", modifier = Modifier.padding(24.dp), fontSize = 36.sp)
}

@Composable
fun HappyBirthdayName(name: String){
    Text(text = "$name~", modifier = Modifier.padding(24.dp), fontSize = 36.sp)
}

@Composable
fun HappyBirthdayColumn(name: String){
    Surface(color = Color.Green) {
        Column  {
            HappyBirthdayName(name = name)
            HappyBirthdayText()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        HappyBirthdayColumn(name = "Hakrim")
    }
}