package com.example.instaprofileui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Button(
            text = "Following",
            color = Color.Green,
            modifier = Modifier
                .weight(4.5f)
        )
        Button(
            text = "Message",
            color = Color.White,
            modifier = Modifier
                .weight(4.5f)
                .padding(horizontal = 5.dp)
        )
        Icon(
            imageVector = Icons.Outlined.KeyboardArrowDown,
            contentDescription = "More",
            tint = Color.White,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(10.dp),
                    color = Color(0xff303030)
                )
                .background(Color(0xFF303030))
                .height(33.dp)
                .aspectRatio(1f, true)
        )

    }
}

@Composable
fun Button(
    text: String,
    modifier: Modifier = Modifier,
    color: Color
) {
    Text(
        text = text,
        color = color,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .height(33.dp)
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(8.dp),
                color = Color(0xff303030)
            )
            .background(Color(0xff303030))
            .padding(3.dp)
    )
}