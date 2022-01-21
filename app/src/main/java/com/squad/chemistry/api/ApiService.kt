package com.squad.chemistry.api

import com.squad.chemistry.models.Element
import retrofit2.http.GET

interface ApiService {

    @GET("https://periodum.com/api/elements/")
    suspend fun getElements(): MutableList<Element>
}