package com.alamin.dagger2

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
class Car {
    lateinit var engine: Engine;
    lateinit var wheels: Wheels;
    @Inject
    constructor(engine: Engine,wheels: Wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    fun startCar(){
        engine.start()
        Log.d("CAR_INFO", " Car Is Running")
    }
}