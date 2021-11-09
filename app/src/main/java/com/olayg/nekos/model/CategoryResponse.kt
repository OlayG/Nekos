package com.olayg.nekos.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class CategoryResponse(
    @Json(name = "url")
    val urls: List<Gif>
) : Parcelable {

    @JsonClass(generateAdapter = true)
    @Parcelize
    data class Gif(
        val url: String,
        @Json(name = "anime_name")
        val animeName: String
    ) : Parcelable
}