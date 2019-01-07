package com.example.panda.retrofitrecycler.network

import com.example.panda.retrofitrecycler.model.ItemModel
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {

    @GET("v1/locations/all?fbclid=IwAR39WuzJtR0L8UB2BUq1Tw5u9u3z1iDHYPHsLkevUjbppALBte2pZdekR4g")
    fun getApiData(): Flowable<List<ItemModel>>

}