package com.example.panda.retrofitrecycler.model

import com.google.gson.annotations.SerializedName

class ItemModel {


    @SerializedName("locations.coordinates.coordinates")
    var coordinates: String? = null
    @SerializedName("locations.id")
    var id: String? = null
    @SerializedName("locations.name")
    var name: String? = null
    @SerializedName("locations.address")
    var address: String? = null
}