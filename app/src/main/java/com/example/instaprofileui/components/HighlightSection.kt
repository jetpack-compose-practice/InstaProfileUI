package com.example.instaprofileui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class HighlightInfo(
    val image: Painter,
    val text: String
)

@Composable
fun HighlightSection(
    modifier: Modifier = Modifier,
    info: List<HighlightInfo>
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp)
    ) {
        items(info) {
            Highlight(info = it)
        }
    }
}

@Composable
fun Highlight(
    info: HighlightInfo
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(end = 8.dp)
    ) {
        Image(
            painter = info.image,
            contentDescription = "Image",
            modifier = Modifier
                .height(65.dp)
                .aspectRatio(1f, true)
                .border(
                    width = 1.dp,
                    shape = CircleShape,
                    color = Color.DarkGray
                )
                .padding(3.dp)
                .clip(CircleShape)
        )
        Text(
            text = info.text,
            color = Color.White,
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
    }
}

