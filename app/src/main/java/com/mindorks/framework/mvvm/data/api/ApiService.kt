package com.mindorks.framework.mvvm.data.api

import com.mindorks.framework.mvvm.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("playlist.json")
    suspend fun getUsers(): Response<List<User>>

}