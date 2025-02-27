package com.imthiyas.cricradio

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { MatchDetailsScreen() }
    }
}

@Composable
fun MatchDetailsScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        item {
            MatchHeader()
            MatchVenueDetails()
            TossDecision()
            UmpiresSection()
            WeatherSection()
            VenueStats()
        }
    }
}

@Composable
fun MatchHeader() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray) //
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("PAK 222/6", color = Color.Green, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text("4 runs", color = Color.White, fontSize = 18.sp)
            Text("CRR: 8.23", color = Color.Gray, fontSize = 14.sp)
            Text("India Opt to Bowl", color = Color.White, fontSize = 16.sp)
        }
    }
}

@Composable
fun MatchVenueDetails() {
    Column(
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Text(
            "Pallekele International Cricket Stadium, Pallekele Sri Lanka",
            color = Color.Blue,
            fontSize = 16.sp,
            textDecoration = TextDecoration.Underline
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text("2nd ODI Afghanistan Tour of Sri Lanka 2024", color = Color.White, fontSize = 14.sp)
        Text("14 Feb 2024, Thursday 2:30 PM", color = Color.White, fontSize = 14.sp)
    }
}

@Composable
fun TossDecision() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF444444)) //
    ) {
        Text(
            "PAK won the toss and chose to bat first",
            color = Color.White,
            fontSize = 14.sp,
            modifier = Modifier.padding(12.dp)
        )
    }
}

@Composable
fun UmpiresSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),

        colors = CardDefaults.cardColors(containerColor = Color.DarkGray) //
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text("Umpires", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Row {
                Text("Michael Gough", color = Color.White, fontSize = 14.sp)
                Spacer(modifier = Modifier.width(16.dp))
                Text("Lyndon Hannibal", color = Color.White, fontSize = 14.sp)
            }
            Text("Third/TV Umpire: Michael Gough", color = Color.White, fontSize = 14.sp)
            Text("Referee: Chris Broad", color = Color.White, fontSize = 14.sp)
        }
    }
}

@Composable
fun WeatherSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),

        colors = CardDefaults.cardColors(containerColor = Color.DarkGray) //
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Filled.WbSunny, contentDescription = "Weather", tint = Color.Yellow)
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text("Pallekele, Sri Lanka", color = Color.White, fontSize = 14.sp)
                Text("25°C Partly Cloudy", color = Color.White, fontSize = 14.sp)
                Text("Last Updated: 14 Feb, 5:32 PM", color = Color.White, fontSize = 12.sp)
            }
        }
    }
}

@Composable
fun VenueStats() {
    Card(
        modifier = Modifier.fillMaxWidth(),

        colors = CardDefaults.cardColors(containerColor = Color.DarkGray) //
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text("Venue Stats", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)

            val stats = listOf(
                "Matches Played" to "25",
                "Lowest Defended" to "25",
                "Highest Chased" to "25",
                "Win Bat First" to "25",
                "Win Ball First" to "25"
            )

            stats.forEach { (label, value) ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(label, color = Color.White, fontSize = 14.sp)
                    Text(value, color = Color.White, fontSize = 14.sp)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            Divider(color = Color.Gray, thickness = 1.dp)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        "1st Inn",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text("Avg Score: 320", color = Color.White, fontSize = 14.sp)
                    Text("Highest Score: 320", color = Color.White, fontSize = 14.sp)
                    Text("Lowest Score: 320", color = Color.White, fontSize = 14.sp)
                    Text("Pace Wickets: 32 (62%)", color = Color.White, fontSize = 14.sp)
                    Text("Spin Wickets: 22 (43%)", color = Color.White, fontSize = 14.sp)
                }
                Column {
                    Text(
                        "2nd Inn",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text("Avg Score: 120", color = Color.White, fontSize = 14.sp)
                    Text("Highest Score: 120", color = Color.White, fontSize = 14.sp)
                    Text("Lowest Score: 120", color = Color.White, fontSize = 14.sp)
                    Text("Pace Wickets: 22 (43%)", color = Color.White, fontSize = 14.sp)
                    Text("Spin Wickets: 32 (62%)", color = Color.White, fontSize = 14.sp)
                }
            }
        }
    }
}
