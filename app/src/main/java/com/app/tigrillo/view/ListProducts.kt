package com.app.tigrillo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.app.tigrillo.R
import com.app.tigrillo.databinding.FragmentListProductsBinding
import com.app.tigrillo.viewmodel.ProductViewModel


class ListProducts : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    val  TAG:  String="ListProductos Fragment"
    lateinit var binding: FragmentListProductsBinding
     val productViewModel : ProductViewModel by viewModels() //viewmodel Instance
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentListProductsBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        productViewModel.getProducts()
//        productViewModel.listProduct.observe(viewLifecycleOwner){
//
//        }


    }
}