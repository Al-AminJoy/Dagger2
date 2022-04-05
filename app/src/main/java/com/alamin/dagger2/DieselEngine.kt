package com.alamin.dagger2

import android.util.Log
import javax.inject.Inject

class DieselEngine : Engine{
    @Inject
    constructor(){

    }
    override fun start() {
        Log.d("CAR_INFO", " Diesel Engine Running")

    }
}