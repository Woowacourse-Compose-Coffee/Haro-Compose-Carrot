package com.example.composecarrot.ui.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.composecarrot.R
import com.example.composecarrot.ui.component.GoodsCard
import com.example.composecarrot.ui.model.GoodsData
import com.example.composecarrot.ui.model.LocaleData

private class GoodsCardPreviewParameterProvider : PreviewParameterProvider<GoodsData> {
    override val values: Sequence<GoodsData> = sequenceOf(
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
        )
    )
}

@Preview(showBackground = true)
@Composable
fun GoodsCardPreview(
    @PreviewParameter(GoodsCardPreviewParameterProvider::class) goodsData: GoodsData
) {
    GoodsCard(goodsData)
}
