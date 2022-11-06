package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //do
            GreetingCardTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Screen()
                }
            }
        }
    }
}
//birthday
@Composable
fun HappyBirthdayText(){
    Text(
        text = stringResource(R.string.happy_birthday_text),
        fontSize = 36.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
    )
}
@Composable
fun HappyBirthdayName(name: String){
    Text(
        text = "$name~",
        fontSize = 36.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(top = 16.dp)
    )
}
@Composable
fun HappyBirthdayColumn(name: String){
    Column  {
        HappyBirthdayName(name = name)
        HappyBirthdayText()
    }
}
@Composable
fun BirthdayGreetingWithImage(name: String) {
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        HappyBirthdayColumn(name = name)
    }
}

//prac1
@Composable
fun H1(){
    Text(
        text = stringResource(R.string.Jetpack1),
        fontSize = 24.sp,
        modifier = Modifier.padding(all = 16.dp)
    )
}
@Composable
fun H2(){
    Text(
        text = stringResource(R.string.Jetpack2),
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Justify
    )
}
@Composable
fun H3(){
    Text(
        text = stringResource(R.string.Jetpack3),
        modifier = Modifier
            .padding(all = 16.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Justify
    )
}
@Composable
fun Prac1(){
    val image = R.drawable.bg_compose_background
    Column {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
        )
        H1()
        H2()
        H3()
    }
}

//prac2
@Composable
fun Text1(){
    Text(
        modifier = Modifier
            .padding(top = 24.dp, bottom = 8.dp)
            .wrapContentWidth(Alignment.CenterHorizontally),
        text = "all task is completed",
        fontSize = 24.sp,
    )
}
@Composable
fun Text2(){
    Text(
        modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally),
        text = "Nice work!",
        fontSize = 16.sp,
    )
}
@Composable
fun Prac2(){
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .wrapContentHeight(Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text1()
        Text2()
    }
}


//prac3
@Composable
fun TextPart(title: String, contents: String){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight(fraction = 0.5F)
            .fillMaxWidth(fraction = 0.5F)
            .padding(all = 16.dp)
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = contents,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}
@Composable
fun Screen(){
    Box(modifier = Modifier.fillMaxSize()){
        Surface(color = Color.Green,modifier = Modifier.align(Alignment.TopStart)) {
            TextPart(stringResource(id = R.string.partTitle1), stringResource(id = R.string.partContent1))
        }
        Surface(color = Color.Cyan,modifier = Modifier.align(Alignment.TopEnd)) {
            TextPart(stringResource(id = R.string.partTitle2), stringResource(id = R.string.partContent2))
        }
        Surface(color = Color.Yellow,modifier = Modifier.align(Alignment.BottomStart)) {
            TextPart(stringResource(id = R.string.partTitle3), stringResource(id = R.string.partContent3))
        }
        Surface(color = Color.LightGray,modifier = Modifier.align(Alignment.BottomEnd)) {
            TextPart(stringResource(id = R.string.partTitle4), stringResource(id = R.string.partContent4))
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingCardTheme {
        Surface(color = MaterialTheme.colors.background) {
            Screen()
        }
    }
}