package com.alamin.dagger2

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims{
        return Rims();
    }

    @Provides
    fun provideTires():Tires{
        return Tires();
    }

    @Provides
    fun getWheels(tires: Tires,rims: Rims): Wheels{
        Log.d("CAR_INFO", " Wheels Module")
        return Wheels(tires,rims);
    }
}