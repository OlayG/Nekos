package com.olayg.nekos.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Category(
    val title: String,
    val format: String,
    val max: String,
    val min: String
) : Parcelable