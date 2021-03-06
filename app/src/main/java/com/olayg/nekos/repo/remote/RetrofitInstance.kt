package com.olayg.nekos.repo.remote

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://nekos.best")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val nekosService = retrofit.create(NekosService::class.java)

}