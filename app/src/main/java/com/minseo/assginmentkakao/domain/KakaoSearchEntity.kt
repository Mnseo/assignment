package com.minseo.assginmentkakao.domain

import com.minseo.assginmentkakao.model.KakaoSearchData

data class KakaoSearchEntity(
    val isFinished: Boolean,
    val itemList: KakaoSearchData
)