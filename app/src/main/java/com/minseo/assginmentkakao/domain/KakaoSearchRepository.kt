package com.minseo.assginmentkakao.domain


//API from https://developers.kakao.com/docs/latest/ko/daum-search/dev-guide#search-image

interface KakaoSearchRepository {
    fun getKakaoImageSearchList(
        query: String,
        sort: String,
        page: Int,
        size: Int
    )
}