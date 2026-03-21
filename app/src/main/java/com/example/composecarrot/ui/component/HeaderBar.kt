package com.example.composecarrot.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecarrot.R
import com.example.composecarrot.ui.theme.pretendardFamily

@Preview(showBackground = true)
@Composable
fun HeaderBar(modifier: Modifier = Modifier) {
    Row (
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("가락2동", fontWeight = FontWeight.W800, fontSize = 24.sp, fontFamily = pretendardFamily)
            Icon(
                painter = painterResource(R.drawable.ic_direction_down),
                contentDescription = "드롭다운 보여주는 아이콘"
            )
        }
        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = "검색 아이콘",
                tint = Color(0xFF212123)
            )
            Icon(
                painter = painterResource(R.drawable.ic_menu_hamburger),
                contentDescription = "더보기 아이콘",
                tint = Color(0xFF212123)
            )
            Icon(
                painter = painterResource(R.drawable.ic_notification_lg),
                contentDescription = "알림 아이콘",
                tint = Color(0xFF212123)
            )
        }
    }
}
