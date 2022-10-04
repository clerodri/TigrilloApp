package com.app.tigrillo.data.network

import com.app.tigrillo.data.model.Producto
import retrofit2.Response
import retrofit2.http.GET

interface ProductApiClient {

    @GET("menu.json?alt=media")
    suspend fun  getAllProducts(): Response<List<Producto>>
}