package com.olayg.nekos.repo.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path

interface NekosService {

    @GET("/api/v1/{path}")
    suspend fun getData(@Path("path") path: String): ResponseBody

}