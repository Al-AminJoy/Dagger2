package com.alamin.dagger2

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car;
}