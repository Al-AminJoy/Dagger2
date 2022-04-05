package com.alamin.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class EngineModule {
    @Binds
    abstract fun providePetrolEngine(petrolEngine: PetrolEngine):Engine
}