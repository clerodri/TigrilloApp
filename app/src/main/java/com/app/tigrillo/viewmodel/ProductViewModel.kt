package com.app.tigrillo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.tigrillo.data.model.Producto
import com.app.tigrillo.data.repository.ProductRepository

class ProductViewModel (val repository:ProductRepository) :ViewModel() {


    private var _listProducts = MutableLiveData<List<Producto>>()
    val listProduct: LiveData<List<Producto>>
        get() = _listProducts

    fun getProducts(){
        _listProducts.value = repository.getData()
    }

}