package com.app.tigrillo.di

import com.app.tigrillo.data.repository.ProductRepository
import com.app.tigrillo.data.repository.ProductoRepositoryImp
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {


    @Provides
    @Singleton
    fun providesRepositoryIntance(database:FirebaseFirestore): ProductRepository {
        return ProductoRepositoryImp(database)
    }

}