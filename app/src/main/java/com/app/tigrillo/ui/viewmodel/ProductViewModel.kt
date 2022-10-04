package com.app.tigrillo.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.tigrillo.data.model.Producto
import com.app.tigrillo.data.repository.ProductRepository
import com.app.tigrillo.domain.getProductUseCase
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor (val repository:ProductRepository,val database:FirebaseFirestore) :ViewModel() {


    private var _listProducts = MutableLiveData<List<Producto>?>()
    val listProduct: MutableLiveData<List<Producto>?>
        get() = _listProducts
    val getProductUseCase= getProductUseCase(repository)

    fun onCreate() {
        viewModelScope.launch {
            val result  = getProductUseCase()
            if(!result.isNullOrEmpty()){
                _listProducts.postValue(listOf(result[0]))
            }
        }
    }
    fun getProducts(){
        _listProducts.value = repository.getData()
    }



}