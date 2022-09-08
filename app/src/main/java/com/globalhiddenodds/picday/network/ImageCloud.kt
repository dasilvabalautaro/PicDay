package com.globalhiddenodds.picday.network

import com.squareup.moshi.Json

data class ImageCloud(
    var id: Int = 0,
    var date: String = "",
    var explanation: String = "",
    var hdurl: String = "",
    @Json(name = "media_type") var mediaType: String = "",
    var title: String = "",
    var url: String = ""
)
