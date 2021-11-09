package com.olayg.nekos.model


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class CategoryOptions(
    val baka: Category,
    val bite: Category,
    val blush: Category,
    val bored: Category,
    val cry: Category,
    val cuddle: Category,
    val dance: Category,
    val facepalm: Category,
    val feed: Category,
    val happy: Category,
    @Json(name = "highfive")
    val highFive: Category,
    val hug: Category,
    val kiss: Category,
    val laugh: Category,
    val nekos: Category,
    val pat: Category,
    val poke: Category,
    val pout: Category,
    val shrug: Category,
    val slap: Category,
    val sleep: Category,
    val smile: Category,
    val smug: Category,
    val stare: Category,
    val think: Category,
    @Json(name = "thumbsup")
    val thumbsUp: Category,
    val tickle: Category,
    val wave: Category,
    val wink: Category
) : Parcelable 