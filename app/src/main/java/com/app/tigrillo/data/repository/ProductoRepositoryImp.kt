package com.app.tigrillo.data.repository

import com.app.tigrillo.data.model.Producto

class ProductoRepositoryImp:ProductRepository {

    override fun getData(): List<Producto> {
        //getdata from firebase

       return listOf()
    }
}