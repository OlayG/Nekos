package com.olayg.nekos.util

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup

fun String.logMe(tag: String = "NekosLogTag") {
    Log.d(tag, this)
}

val ViewGroup.layoutInflater
    get() = LayoutInflater.from(context)