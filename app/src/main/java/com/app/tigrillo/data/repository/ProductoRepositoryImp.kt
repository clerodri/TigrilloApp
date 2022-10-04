package com.app.tigrillo.data.repository

import com.app.tigrillo.data.ProductCache
import com.app.tigrillo.data.model.Producto
import com.app.tigrillo.data.network.ProductApiClass
import com.google.firebase.firestore.FirebaseFirestore

class ProductoRepositoryImp(var database:FirebaseFirestore):ProductRepository {


    private val api=ProductApiClass()
    override fun getData(): List<Producto> {
        //getdata from firebase

       return arrayListOf()
    }

    override suspend fun getAllProductosByApi():List<Producto>{
        val response = api.getProduct()
        ProductCache.productos = response
        return response
    }
}