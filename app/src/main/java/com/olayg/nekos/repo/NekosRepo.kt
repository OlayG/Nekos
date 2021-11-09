package com.olayg.nekos.repo

import com.olayg.nekos.model.Category
import com.olayg.nekos.repo.remote.RetrofitInstance
import com.olayg.nekos.repo.remote.adapter.MoshiAdapter

object NekosRepo {

    private val nekosService by lazy { RetrofitInstance.nekosService }

    suspend fun getCategories(): List<Category> = MoshiAdapter.run {
        val response = nekosService.getData("endpoints")
        // TODO: 11/9/21 figure out why this is run blocking
        val json = response.string().run { substring(1, length.minus(2)) }
            .split("},")
            .map {
                val split = it.split(":{")
                val jsonObject = String.format("{ %s, %s }", "\"title\": ${split[0]}", split[1])
                jsonObject
            }

        fromJson(json.toString())
    }

}