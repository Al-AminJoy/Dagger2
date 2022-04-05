package com.alamin.dagger2

import dagger.Module
import dagger.Provides

@Module
class EngineModule {
    @Provides
    fun providePetrolEngine(petrolEngine: PetrolEngine):Engine{
        return petrolEngine
    }
}