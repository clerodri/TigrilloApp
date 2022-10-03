package com.app.tigrillo.data.repository

import com.app.tigrillo.data.model.Producto

interface ProductRepository {


    fun getData():List<Producto>
}