package com.chachaup.ilearn

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chachaup.ilearn.ui.theme.ILearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ILearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetNewMemberWithImage("Consuelo")
                }
            }
        }
    }
}

@Composable
fun GreetNewMemberText(name: String){
    Column{
        Text(
            text = "Hello $name!",
            fontSize = 25.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
        )
        Text(
            text = "Welcome to Wakanda!",
            fontSize = 30.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}

@Composable
fun GreetNewMemberWithImage(name: String){
    val image = painterResource(id = R.drawable.black_panther)
    Box{
        Image(
            painter = image,
            contentScale = ContentScale.Crop,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        )
        GreetNewMemberText(name = name)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetNewMemberWithImagePreview(){
    ILearnTheme {
        GreetNewMemberWithImage(name = "Consuelo")
    }
}