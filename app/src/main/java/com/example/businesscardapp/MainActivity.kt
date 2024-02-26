package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier=Modifier) {
    val android_image = painterResource(id = R.drawable.ic_android_black_24dp)
    val phone_image = painterResource(id = R.drawable.baseline_local_phone_24)
    val email_image = painterResource(id = R.drawable.baseline_alternate_email_24)
    val share_image = painterResource(id = R.drawable.baseline_share_24)
    val background_img = painterResource(id = R.drawable.androidparty)

    Image(
        painter = background_img,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5F
    )
    Column(modifier= modifier.fillMaxSize()) {

        Column (modifier = modifier
            .weight(1f)
            .fillMaxSize(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = android_image, contentDescription = null)
            Text(
                text = "Muhammed DİNÇ",
                Modifier.padding(8.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Maker",
                fontSize = 22.sp,
                color = Color.Red,
                fontWeight = FontWeight.SemiBold,
                modifier = modifier.padding(bottom = 55.dp)
            )
        }


        Column (modifier=modifier.weight(1F)){
            Row(
                modifier = modifier
                    .padding(bottom = 5.dp, start = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(painter = phone_image, contentDescription = null)
                Text(text = "+90 550 100 1020", modifier = modifier.padding(start = 10.dp))
            }
            Row(
                modifier = modifier
                    .padding(bottom = 5.dp, start = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(painter = share_image, contentDescription = null)
                Text(text = "github.com/muhammeddincmdx", modifier = modifier.padding(start = 10.dp))
            }

            Row(
                modifier = modifier
                    .padding(bottom = 5.dp, start = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(painter = email_image, contentDescription = null)
                Text("me.muhammed.dinc@gmail.com", modifier = modifier.padding(start = 10.dp))
            }
        }

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCard()

    }
}