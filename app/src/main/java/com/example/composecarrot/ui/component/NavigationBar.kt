package com.example.composecarrot.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composecarrot.R
import com.example.composecarrot.ui.theme.pretendardFamily

@Composable
fun NavigationBar(modifier: Modifier = Modifier) {
    Row (
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        NavigationBox(iconId = R.drawable.ic_bottombar_home, text = "홈")
        NavigationBox(iconId = R.drawable.ic_bottombar_life, text = "동네생활")
        NavigationBox(iconId = R.drawable.ic_bottombar_map, text = "동네지도")
        NavigationBox(iconId = R.drawable.ic_bottombar_chat, text = "채팅")
        NavigationBox(iconId = R.drawable.ic_bottombar_mypage, text = "나의 당근")

    }
}

@Composable
fun NavigationBox(iconId: Int, text: String) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(painter = painterResource(id = iconId), contentDescription = "홈 박스")
        Text(text = text, fontFamily = pretendardFamily, fontWeight = FontWeight.W500, fontSize = 11.sp)
    }
}
