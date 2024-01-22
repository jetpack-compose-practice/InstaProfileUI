package com.example.instaprofileui.components

import android.provider.MediaStore.Video
import android.widget.VideoView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class mediaData(
    val image: Painter,
    val text: String
)

@Composable
fun MediaSection(
    modifier: Modifier = Modifier,
    mediaData: List<mediaData>,
    onTabSelected: (selectedIndex: Int) -> Unit
) {
    var selectedTabIndex: Int by remember {
        mutableStateOf(0)
    }
    val inactiveColor = Color(0xff999999)

    TabRow(
        selectedTabIndex = selectedTabIndex,
        containerColor = Color.Transparent,
        modifier = modifier.padding(top = 10.dp)
    ) {
        mediaData.forEachIndexed { index, data ->
            Tab(
                selected = selectedTabIndex == index,
                selectedContentColor = Color.White,
                unselectedContentColor = inactiveColor,
                onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                }) {
                Icon(
                    painter = data.image,
                    contentDescription = data.text,
                    tint = if (selectedTabIndex == index) Color.White else inactiveColor,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(25.dp)
                )
            }
        }
    }
}

data class PostData(
    val image: Painter
)

data class ReelData(
    val video: Painter
)

@Composable
fun Post(
    postData: PostData
) {
    Image(
        painter = postData.image,
        contentDescription = "Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .aspectRatio(1f)
            .padding(2.dp)
    )
}

@Composable
fun Msg(
    text: String
) {
    Text(
        text = text,
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    )
}