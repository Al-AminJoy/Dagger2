package com.alamin.dagger2

import javax.inject.Inject

class Wheels {
    lateinit var tires: Tires;
    lateinit var rims: Rims
    constructor(tires: Tires,rims: Rims){
        this.tires = tires;
        this.rims = rims
    }
}