package com.example.composecarrot.ui.model

data class GoodsData(val id: Int, val title: String, val price: String, val localeData: LocaleData, val reservation: Boolean = false, val heartNum: Int = 0, val chatNum: Int = 0) {
}
