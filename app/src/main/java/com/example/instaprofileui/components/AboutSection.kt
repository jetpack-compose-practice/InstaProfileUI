package com.example.instaprofileui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutSection(
    threadName: String,
    name: String,
    about: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ) {
        Text(
            text = name,
            fontSize = 18.sp,
            color = Color.White
        )
        Text(
            text = "@ $threadName",
            color = Color.White,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(vertical = 4.dp)
                .background(color = Color(0xff303030), shape = RoundedCornerShape(14.dp))
                .padding(horizontal = 12.dp, vertical = 3.dp)
        )
        Text(
            text = about,
            fontSize = 14.sp,
            color = Color.White,
        )
        Text(
            text = "Followed by narendramodi, amitabhbachchan and 8 others",
            fontSize = 15.sp,
            color = Color.White,
            modifier = Modifier.padding(vertical = 5.dp)
        )
    }
}
