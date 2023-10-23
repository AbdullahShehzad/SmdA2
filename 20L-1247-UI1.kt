package com.example.smda1ui2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smda1ui2.ui.theme.SmdA1UI2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmdA1UI2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.background_image), // Replace with your background image's resource ID
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .background(Color.Transparent)
                //        .padding(16.dp)
                .fillMaxWidth(),
        )
        {
            Row(

                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.List,
                        contentDescription = null,
                        tint = Color.White.copy(alpha = 0.8f),
                        modifier = Modifier
                            .size(25.dp)

                    )
                    Text(
                        text = "MUMBAI",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        color = Color(0xFF6060FF)
                        //color = Color.White.copy(alpha = 0.8f)

                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.White.copy(alpha = 0.8f),
                        modifier = Modifier
                            .padding(4.dp)
                            .size(25.dp),
                    )
                    Icon(
                        imageVector = Icons.Default.Build,
                        contentDescription = null,
                        tint = Color.White.copy(alpha = 0.8f),
                        modifier = Modifier.size(25.dp)
                    )
                }

            }
            Row(
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("28°C", fontWeight = FontWeight.SemiBold, fontSize = 48.sp,color = Color.White.copy(alpha = 0.8f))
                Text("13 FEB, SAT", fontWeight = FontWeight.Normal, fontSize = 20.sp,color = Color.White.copy(alpha = 0.8f))
            }
            Row(
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("SUNNY", fontWeight = FontWeight.Medium, fontSize = 20.sp,color = Color(0xFF6060FF))
                Text("02:00 PM", fontWeight = FontWeight.Normal, fontSize = 20.sp,color = Color(0xFFD03670))

            }

            Column (modifier = Modifier.fillMaxSize()){
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.Transparent)
                )

                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(2.dp)
                    ) {
                        Text("SAT", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                        Text("SUN", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                        Text("MON", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                        Text("TUE", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                        Text("WED", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            modifier = Modifier.size(35.dp),
                            painter = painterResource(id = R.drawable.sunny),
                            contentDescription = null,
                        )

                        Image(
                            modifier = Modifier.size(35.dp),
                            painter = painterResource(id = R.drawable.sunny),
                            contentDescription = null,
                        )

                        Image(
                            modifier = Modifier.size(35.dp),
                            painter = painterResource(id = R.drawable.cloudy),
                            contentDescription = null,
                        )

                        Image(
                            modifier = Modifier.size(35.dp),
                            painter = painterResource(id = R.drawable.sunny),
                            contentDescription = null,
                        )

                        Image(
                            modifier = Modifier.size(35.dp),
                            painter = painterResource(id = R.drawable.cloudy),
                            contentDescription = null,
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp)
                    ) {
                        Text("28", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                        Text("31", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                        Text("31", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                        Text("32", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                        Text("32", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)


                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SmdA1UI2Theme {
        Greeting("Android")
    }
}