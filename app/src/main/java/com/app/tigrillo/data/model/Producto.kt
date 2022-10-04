package com.app.tigrillo.data.model

import com.google.gson.annotations.SerializedName

data class Producto(
    @SerializedName("title") var title: String, @SerializedName("image") var url: String,
    @SerializedName("id") var id: String
)
