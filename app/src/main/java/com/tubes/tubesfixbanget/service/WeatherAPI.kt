package com.tubes.tubesfixbanget.service

import com.tubes.tubesfixbanget.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {


    @GET("data/2.5/weather?&units=metric&lang=id&APPID=0c648c0d09fd73a90b374888b679ef37")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeatherModel>

}