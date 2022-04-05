package com.alamin.dagger2

import dagger.Component

@Component(modules = [EngineModule::class])
interface CarComponent {
    //fun getCar(): Car;

    fun inject(mainActivity: MainActivity)
}