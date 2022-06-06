package com.trasty.compose

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trasty.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ){
                ListItem("Damir", "Handyman")
                ListItem("Aida", "Photograph")
                ListItem("Nurlan", "Singer")
                ListItem("Someone", "Someone")
            }
        }
    }
}

@Composable
private fun ListItem(name: String, prof: String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .pointerInput(Unit){
                detectHorizontalDragGestures { change, dragAmount ->
                    Log.d("MyLog", "Long press $dragAmount")
                }


            }
            .clickable {
                Log.d("MyLog", "Clicked $name")
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ){
        Box(){
            Row(verticalAlignment = Alignment.CenterVertically){
                Image(
                    painter = painterResource(id =
                    when (name) {
                        "Damir" -> R.drawable.damir
                        "Aida" -> R.drawable.aida
                        "Nurlan" -> R.drawable.nurlan
                        else -> {R.drawable.my}
                    }
                    ),
                    contentDescription = "Person",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier.padding(start = 16.dp)
                ) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }
}












