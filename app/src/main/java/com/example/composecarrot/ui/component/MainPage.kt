package com.example.composecarrot.ui.component

import android.R.attr.x
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.composecarrot.R
import com.example.composecarrot.ui.model.GoodsData
import com.example.composecarrot.ui.model.LocaleData

@Preview(showBackground = true)
@Composable
fun MainPage() {

    val items = listOf(
        GoodsData(
            id = R.drawable.img_list_home_1,
            title = "산산기어 스웻집업(마지막가격)",
            price = "40,000원",
            localeData = LocaleData(
                distinct = 3.4, locale = "위례동", time = "15분 전"
            ),
            heartNum = 8,
        ),
        GoodsData(
            id = R.drawable.img_list_home_2,
            title = "브라운야드 니트 브라운 2사이즈",
            price = "40,000원",
            localeData = LocaleData(
                distinct = 4.0, locale = "가락본동", time = "6시간 전"
            ),
            heartNum = 4,
        ),
        GoodsData(
            id = R.drawable.img_list_home_3,
            title = "M) 코튼 리브드 크루 넥 니트  미디엄 그레이",
            price = "20,000원",
            reservation = true,
            localeData = LocaleData(
                distinct = 1.9, locale = "장지동", time = "1시간 전"
            )
        ),
        GoodsData(
            id = R.drawable.img_list_home_4,
            title = "렉토 맨투맨",
            price = "70,000원",
            localeData = LocaleData(
                distinct = 4.9, locale = "장지동", time = "5시간 전"
            )
        ),
        GoodsData(
            id = R.drawable.img_list_home_5,
            title = "띠어리맨 트러커자켓 (s)",
            price = "90,000원",
            localeData = LocaleData(
                distinct = 1.9, locale = "잠실3동", time = "3시간 전"
            )
        ),
        GoodsData(
            id = R.drawable.img_list_home_6,
            title = "스트라이다 자전거 18인치 블랙",
            price = "35만원",
            localeData = LocaleData(
                distinct = 3.5, locale = "잠실4동", time = "31분 전"
            )
        )
    )

    Column {
        HeaderBar(
            modifier = Modifier.padding(
                top = 43.dp,
                bottom = 27.dp,
                start = 16.dp,
                end = 16.dp
            )
        )
        ConditionBar(modifier = Modifier.padding(horizontal = 16.dp))
        Spacer(modifier = Modifier.height(31.dp))
        Box(modifier = Modifier.fillMaxSize()) {
            LazyColumn(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(17.dp)
            ) {
                itemsIndexed(items) { index, item ->
                    Column {
                        GoodsCard(goodsData = item)
                        Spacer(modifier = Modifier.height(17.dp))
                        if (index != items.lastIndex) {
                            HorizontalDivider(color = Color(0xFFF4F5F7))
                        }
                    }
                }
            }
            WritingButton(
                modifier = Modifier
                    .padding(end = 16.dp, bottom = 80.dp)
                    .size(width = 97.dp, height = 50.dp)
                    .clip(shape = RoundedCornerShape(50.dp))
                    .background(color = Color(0xFFFF6E10))
                    .align(Alignment.BottomEnd)
            )
            Box (
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .fillMaxWidth()
            ) {
                HorizontalDivider(modifier = Modifier.zIndex(1f))
                NavigationBar(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.White)
                        .padding(start = 27.dp, end = 21.dp, top = 6.dp, bottom = 9.dp)
                )
            }


        }
    }
}

