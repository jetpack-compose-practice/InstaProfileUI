package com.example.instaprofileui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instaprofileui.R

data class PostData (
    val image: Painter,
    val text: String
)

@Composable
fun PostSection(
    modifier: Modifier = Modifier,
    postData: List<PostData>,
//    onTabSelected: (selectedIndex: Int) -> Unit
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    val inactiveColor = Color(0xff999999)

    TabRow(
        selectedTabIndex = selectedTabIndex,
        containerColor = Color.Transparent,
        contentColor = Color.White,
        modifier = Modifier.padding(vertical = 10.dp)
    ) {
        postData.forEachIndexed { index, data ->
            Tab(
                selected = selectedTabIndex == index,
                selectedContentColor = Color.White,
                unselectedContentColor = inactiveColor,
                onClick = {
                    selectedTabIndex = index
//                    onTabSelected(index)
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