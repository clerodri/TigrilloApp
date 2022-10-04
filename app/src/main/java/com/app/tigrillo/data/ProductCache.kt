package com.app.tigrillo.data

import com.app.tigrillo.data.model.Producto

class ProductCache {
    companion object {
        var productos:List<Producto> = emptyList()
    }
}