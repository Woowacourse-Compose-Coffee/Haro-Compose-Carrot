package com.example.composecarrot.ui.model

data class GoodsData(val id: Int, val title: String, val price: String, val localeData: LocaleData, val heartNum: Int = 0, val chatNum: Int = 0) {
}
