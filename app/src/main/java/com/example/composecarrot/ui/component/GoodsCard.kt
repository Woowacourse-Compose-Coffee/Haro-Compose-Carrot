package com.example.composecarrot.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecarrot.R
import com.example.composecarrot.ui.model.GoodsData
import com.example.composecarrot.ui.theme.pretendardFamily

@Composable
fun GoodsCard(modifier: Modifier = Modifier, goodsData: GoodsData) {
    Row(
        modifier = modifier.fillMaxWidth().height(108.dp),
        horizontalArrangement = Arrangement.spacedBy(17.dp)
    ) {
        Image(
            painter = painterResource(id = goodsData.id),
            contentDescription = "상품 이미지",
            Modifier.size(108.dp)
        )
        Column (
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column (
                    modifier = Modifier.width(223.dp),
                    verticalArrangement = Arrangement.spacedBy(7.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    GoodsInfoText(goodsData.title)
                    DistinctInfoComponent(distinct = goodsData.localeData.distinct, locale = goodsData.localeData.locale, time = goodsData.localeData.time, maxDistinct = 4.0)
                    GoodsInfoText(goodsData.price)
                }
                Icon(
                    modifier = Modifier.padding(end = 4.dp).size(18.dp),
                    painter = painterResource(R.drawable.ic_menu_kebab_gray),
                    contentDescription = "더보기 버튼",
                    tint = Color(0xFF868C93)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                if (goodsData.chatNum != 0) ChatComponent(goodsData.chatNum)
                if (goodsData.chatNum != 0 && goodsData.heartNum != 0) Box(modifier = Modifier.width(2.dp))
                if (goodsData.heartNum != 0) HeartComponent(goodsData.heartNum)
            }
        }


    }
}

@Composable
fun DistinctInfoText(text: String) {
    Text(text, fontSize = 14.sp, fontWeight = FontWeight.W500, color = Color(0xFF868C93), fontFamily = pretendardFamily)
}

@Composable
fun GoodsInfoText(text: String) {
    Text(text, fontSize = 17.sp, fontWeight = FontWeight.W500, color = Color(0xFF000000), fontFamily = pretendardFamily)
}

@Composable
fun HeartComponent(num: Int) {
    Row(
        modifier = Modifier.padding(end = 1.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_like_sm),
            contentDescription = "좋아요 아이콘",
            modifier = Modifier.size(18.dp),
            tint = Color(0xFF868C93)
        )
        DistinctInfoText("$num")
    }
}

@Composable
fun ChatComponent(num: Int) {
    Row(
        modifier = Modifier.padding(end = 1.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_chat_sm),
            contentDescription = "채팅 아이콘",
            modifier = Modifier.size(18.dp),
            tint = Color(0xFF868C93)
        )
        DistinctInfoText("$num")
    }
}

@Composable
fun DistinctInfoComponent(distinct: Double, locale: String, time: String, maxDistinct: Double) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        if (distinct < maxDistinct) {
            Icon(
                painter = painterResource(id = R.drawable.ic_location),
                contentDescription = "위치 아이콘",
                tint = Color(0xFF868C93)
            )
            DistinctInfoText("${distinct}km")
            DistinctInfoText("·")
        }
        DistinctInfoText(locale)
        DistinctInfoText("·")
        DistinctInfoText(time)
    }
}
