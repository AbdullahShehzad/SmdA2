package com.example.smda2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smda2.ui.theme.SmdA2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmdA2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight(),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(20.dp),
                ) {
                    Column(modifier = Modifier.weight(1f),)
                    {
                        Icon(
                            imageVector = Icons.Default.ArrowBack, // Add icon
                            contentDescription = null, // Content description for accessibility
                            tint = Color.LightGray, // Icon color
                            modifier = Modifier.size(30.dp)
                        )
                    }
                    Column(modifier = Modifier.weight(3f)) {
                        Text(
                            text = "LOCATIONS",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF424242)
                        )
                    }
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.End

                    )
                    {
                        Icon(
                            imageVector = Icons.Default.Menu, // Add icon
                            contentDescription = null, // Content description for accessibility
                            tint = Color.LightGray, // Icon color
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(40.dp),
                ) {
                    Text(
                        text = "You are currently getting results from popular places from India",
 //                       fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Gray
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(start = 40.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.width(150.dp),
                        colors = ButtonDefaults.buttonColors(Color.LightGray)

                    ) {
                        Text(text = "Choose place", color = Color(0xFF5C6BC0))
                    }
                }
            }

            // Second Column
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.LightGray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color(0xFF424242),
                    modifier = Modifier.size(50.dp),
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "ADD PLACE",
                    color =Color(0xFF424242),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF5C6BC0))
                .weight(1f)
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            //verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier= Modifier
                    .weight(2f)
                    .padding(horizontal = 30.dp, vertical = 40.dp),
            )
            {
                Text("Mumbai", fontSize = 30.sp, textAlign = TextAlign.Center, color = Color.White)
                Spacer(modifier = Modifier.height(10.dp))
                Text("Humidity : 51%", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color(0xFFB0B0B0))
            }

            Row(
                modifier= Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text("28, Sunny", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color(0xFFE65100))
            }
        }

        // third Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            //verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier= Modifier
                    .weight(2f)
                    .padding(horizontal = 30.dp, vertical = 40.dp),
            )
            {
                Text("Indore", fontSize = 30.sp, textAlign = TextAlign.Center, color = Color(0xFF424242))
                Spacer(modifier = Modifier.height(10.dp))
                Text("Humidity : 35%", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color(0xFFB0B0B0))
            }

            Row(
                modifier= Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text("24, Smoke", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color(0xFF5C6BC0))
            }
        }

        // fourth Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            //verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier= Modifier
                    .weight(2f)
                    .padding(horizontal = 30.dp, vertical = 40.dp),
            )
            {
                Text("Bhopal", fontSize = 30.sp, textAlign = TextAlign.Center, color = Color(0xFF424242))
                Spacer(modifier = Modifier.height(10.dp))
                Text("Humidity : 35%", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color(0xFFB0B0B0))
            }

            Row(
                modifier= Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text("21, Clear", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color(0xFF5C6BC0))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SmdA2Theme {
        Greeting()
    }
}