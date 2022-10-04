package com.app.tigrillo.domain

import com.app.tigrillo.data.model.Producto
import com.app.tigrillo.data.repository.ProductRepository
import com.app.tigrillo.di.RepositoryModule
import com.google.firebase.firestore.FirebaseFirestore

class getProductUseCase(var repository:ProductRepository) {



    suspend operator  fun invoke():List<Producto>?= repository.getAllProductosByApi()

}