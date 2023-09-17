package com.minseo.assginmentkakao.model

import java.util.*

data class KakaoSearchData(
    val title: String,
    val url: String,
    val originUrl: String? = null,
    val thumbnailUrl: String,
    val dateTime: Date,
    val mediaType: KakakoSearchMediaType
)

enum class KakakoSearchMediaType {
    IMAGE,
    VIDEO
}

