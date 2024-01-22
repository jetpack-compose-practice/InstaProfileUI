package com.example.instaprofileui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.instaprofileui.components.AboutSection
import com.example.instaprofileui.components.ButtonSection
import com.example.instaprofileui.components.HighlightInfo
import com.example.instaprofileui.components.HighlightSection
import com.example.instaprofileui.components.PostData
import com.example.instaprofileui.components.PostSection
import com.example.instaprofileui.components.ProfileSection
import com.example.instaprofileui.components.TopBar

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        TopBar("rj02piyush")
        ProfileSection()
        AboutSection(
            threadName = "rj02piyush",
            name = "Piyush Prajapati",
            about = "Hi I m Piyush Prajapati."
        )
        ButtonSection()
        HighlightSection(
            info = listOf(
                HighlightInfo(painterResource(id = R.drawable.me), "Diwali"),
                HighlightInfo(painterResource(id = R.drawable.me2), "Jaipur"),
                HighlightInfo(painterResource(id = R.drawable.wallpaper1), "Goa"),
                HighlightInfo(painterResource(id = R.drawable.wallpaper2), "..."),
                HighlightInfo(painterResource(id = R.drawable.me2), "Thailand"),
                HighlightInfo(painterResource(id = R.drawable.wallpaper4), "Trip"),
                HighlightInfo(painterResource(id = R.drawable.me), "Me"),
                HighlightInfo(painterResource(id = R.drawable.wallpaper3), "..."),
                HighlightInfo(painterResource(id = R.drawable.wallpaper1), "Delhi")
            )
        )
        PostSection(
            postData = listOf(
                PostData(painterResource(id = R.drawable.ic_grid), "Posts"),
                PostData(painterResource(id = R.drawable.reels), "Reels"),
                PostData(painterResource(id = R.drawable.profile), "Profile"),
            )
        )
    }
}