package com.alamin.dagger2

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
class Car {
    lateinit var engine: Engine;
    @Inject
    lateinit var wheels: Wheels;
    @Inject
    constructor(engine: Engine){
        this.engine = engine;
    }

    @Inject
    fun provideCarToRemote(remote: Remote){
        remote.provideCar(this)
    }

    fun startCar(){
        engine.start()
        Log.d("CAR_INFO", " Car Is Running")
        Log.d("CAR_INFO", wheels.toString())
    }
}