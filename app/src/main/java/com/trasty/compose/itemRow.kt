package com.trasty.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MyRow(item: ItemRowModel) {
    var isExpanded by remember{
        mutableStateOf(false)
    } //обьект состояние, нужный чтобы переменная сохранялась в памяти
    // чтобы контент обновлялся(перерисовывался) при изменении обьекта состояния
    Row(
        modifier = Modifier
            .padding(3.dp)
            .fillMaxWidth()
            .background(Color.White)
    ){
        Image(painter = painterResource(id = item.ImageId),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(3.dp)
                .size(64.dp)
                .clip(CircleShape)
        )
        Column(modifier = Modifier
            .padding(start = 5.dp, top = 10.dp)) {
            Text(text = item.title)
            Text(modifier = Modifier.clickable{
                isExpanded = !isExpanded
                }, maxLines = if(isExpanded) 10 else 1, text = item.content)
        }
    }
}