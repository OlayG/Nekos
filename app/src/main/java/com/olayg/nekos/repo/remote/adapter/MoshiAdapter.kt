package com.olayg.nekos.repo.remote.adapter

import com.olayg.nekos.model.Category
import com.olayg.nekos.model.CategoryOptions
import com.squareup.moshi.FromJson
import com.squareup.moshi.Moshi
import com.squareup.moshi.ToJson
import com.squareup.moshi.Types

object MoshiAdapter {

    private val moshi by lazy { Moshi.Builder().build() }
    private val categoryAdapter by lazy {
        val type = Types.newParameterizedType(List::class.java, Category::class.java)
        moshi.adapter<List<Category>>(type)
    }

    fun fromJson(categoryOptions: String): List<Category> {
        return categoryAdapter.fromJson(categoryOptions) ?: emptyList()
    }
}