package com.example.simplegetrequest

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("/people/")
  //@GET("/api/unknown")
    fun doGetListResources(): Call<List<PeopleDetails.Datum>>
}