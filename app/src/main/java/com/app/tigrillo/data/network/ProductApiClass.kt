package com.app.tigrillo.data.network

import com.app.tigrillo.data.model.Producto
import com.app.tigrillo.di.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductApiClass {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun  getProduct():List<Producto>{
        return withContext(Dispatchers.IO) {
            val responde = retrofit.create(ProductApiClient::class.java).getAllProducts()
            responde.body() ?: emptyList()
        }
    }
}