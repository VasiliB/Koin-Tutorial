package com.mindorks.framework.mvvm.data.model

import com.squareup.moshi.Json


data class User(

    @Json(name = "title")
    val title: String = "",
    @Json(name = "artist")
    val artist: String = "",
    @Json(name = "bitmapUri")
    val bitmapUri: String = "",
    @Json(name = "trackUri")
    val trackUri: String = ""
//    @Json(name = "id")
//    val id: Int = 0,
//    @Json(name = "name")
//    val name: String = "",
//    @Json(name = "email")
//    val email: String = "",
//    @Json(name = "avatar")
//    val avatar: String = ""
)