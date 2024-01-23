package com.example.instaprofileui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.instaprofileui.components.AboutSection
import com.example.instaprofileui.components.ButtonSection
import com.example.instaprofileui.components.HighlightInfo
import com.example.instaprofileui.components.HighlightSection
import com.example.instaprofileui.components.MediaData
import com.example.instaprofileui.components.MediaSection
import com.example.instaprofileui.components.Msg
import com.example.instaprofileui.components.Post
import com.example.instaprofileui.components.PostData
import com.example.instaprofileui.components.ProfileSection
import com.example.instaprofileui.components.TopBar

@Composable
fun ProfileScreen() {

    var selectedTabIndex by remember {
        mutableStateOf(0)
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        item(span = { GridItemSpan(3) }) {
            TopBar("rj02piyush")

        }
        item(span = { GridItemSpan(3) }) {
            ProfileSection()
        }
        item(span = { GridItemSpan(3) }) {
            AboutSection(
                threadName = "rj02piyush",
                name = "Piyush Prajapati",
                about = "Hi I m Piyush Prajapati."
            )
        }
        item(span = { GridItemSpan(3) }) {
            ButtonSection()
        }
        item(span = { GridItemSpan(3) }) {
            HighlightSection(
                info = listOf(
                    HighlightInfo(painterResource(id = R.drawable.logo), "Diwali"),
                    HighlightInfo(painterResource(id = R.drawable.logo), "Jaipur"),
                    HighlightInfo(painterResource(id = R.drawable.logo), "Goa"),
                    HighlightInfo(painterResource(id = R.drawable.logo), "..."),
                    HighlightInfo(painterResource(id = R.drawable.logo), "Thailand"),
                    HighlightInfo(painterResource(id = R.drawable.logo), "Trip"),
                    HighlightInfo(painterResource(id = R.drawable.logo), "Me"),
                    HighlightInfo(painterResource(id = R.drawable.logo), "..."),
                    HighlightInfo(painterResource(id = R.drawable.logo), "Delhi")
                )
            )

        }
        item(span = { GridItemSpan(3) }) {
            MediaSection(
                mediaData = listOf(
                    MediaData(painterResource(id = R.drawable.ic_grid), "Posts"),
                    MediaData(painterResource(id = R.drawable.reels), "Reels"),
                    MediaData(painterResource(id = R.drawable.profile), "Profile"),
                )
            ) {
                selectedTabIndex = it
            }
        }
        when (selectedTabIndex) {
            0 -> items(
                listOf(
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                    R.drawable.logo,
                )
            ) { resourceId ->
                Post(postData = PostData(painterResource(id = resourceId)))
            }
            1 -> item(span = { GridItemSpan(3) }) { Msg(text = "No reels to show") }
            2 -> item(span = { GridItemSpan(3) }) { Msg(text = "Nothing to show ") }
        }


    }
}