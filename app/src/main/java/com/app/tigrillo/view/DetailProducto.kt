package com.app.tigrillo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.tigrillo.R
import com.app.tigrillo.databinding.FragmentDetailProductoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailProducto : Fragment() {

    lateinit var  binding : FragmentDetailProductoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentDetailProductoBinding.inflate(layoutInflater)
        return binding.root}


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}