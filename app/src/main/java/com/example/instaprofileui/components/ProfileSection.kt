package com.example.instaprofileui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instaprofileui.R

@Composable
fun ProfileSection(

) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        ProfilePhoto(
            photo = painterResource(id = R.drawable.me),
            Modifier
                .size(92.dp)
                .weight(3f)
        )
        StatsSection(Modifier.weight(7f))
    }
}

@Composable
fun ProfilePhoto(
    photo: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = photo,
        contentDescription = "Profile Photo",
        modifier = modifier
            .aspectRatio(1f, true)
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = CircleShape
            )
            .padding(4.dp)
            .clip(CircleShape)
    )
}

@Composable
fun StatsSection(
    modifier: Modifier = Modifier
) {
    Row (
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Stats(count = "14", title = "Posts")
        Stats(count = "2.5M", title = "Followers")
        Stats(count = "426", title = "Following")
    }
}

@Composable
fun Stats(
    count: String,
    title: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = count,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = title,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}