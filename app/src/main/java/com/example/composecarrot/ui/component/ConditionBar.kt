package com.example.composecarrot.ui.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecarrot.R

@Preview(showBackground = true)
@Composable
fun ConditionBar() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box (
            modifier = Modifier.border(width = 1.dp, color = Color(0xFFEAEBEF), shape = CircleShape)
        ) {
            Icon(
                modifier = Modifier.padding(8.dp),
                painter = painterResource(R.drawable.ic_reset), tint = Color(0xFF4D5159),
                contentDescription = "리셋 아이콘"
            )
        }
        Row (
          horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ConditionButton(text = "가락2동 외 59")
            ConditionButton(text = "가격")
            ConditionButton(text = "카테고리")
            ConditionButton(text = "정확도순")
        }
    }
}

@Composable
fun ConditionButton(text: String) {
    Box (
        modifier = Modifier.border(width = 1.dp, color = Color(0xFFEAEBEF), shape = RoundedCornerShape(50.dp))
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.5.dp, horizontal = 11.dp)
        ) {
            Text(text, fontSize = 14.sp, fontWeight = FontWeight.W500, color = Color(0xFF212123))
            Icon(
                painter = painterResource(id = R.drawable.ic_direction_down),
                contentDescription = "드롭다운 보여주는 아이콘"
            )
        }
    }
}
