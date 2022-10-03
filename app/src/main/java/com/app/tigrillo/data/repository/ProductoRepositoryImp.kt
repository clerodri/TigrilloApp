package com.app.tigrillo.data.repository

import com.app.tigrillo.data.model.Producto
import com.google.firebase.firestore.FirebaseFirestore

class ProductoRepositoryImp(var database:FirebaseFirestore):ProductRepository {

    override fun getData(): List<Producto> {
        //getdata from firebase

       return arrayListOf(
           Producto("hola","hasasdf",4),
                   Producto("hola","hasasdf",4),
        Producto("hola","hasasdf",4)
       )
    }
}