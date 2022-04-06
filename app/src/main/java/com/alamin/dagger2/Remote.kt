package com.alamin.dagger2

import android.util.Log
import javax.inject.Inject

class Remote {
    private lateinit var car:Car
    @Inject
    constructor(){
    }

    fun provideCar(car: Car){
        this.car = car
        Log.d("CAR_INFO", " Car Providing Remote ")
        car.startCar()
    }
}