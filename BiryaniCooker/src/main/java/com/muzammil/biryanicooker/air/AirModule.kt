package com.muzammil.biryanicooker

import com.muzammil.biryanicooker.air.AirScope
import com.muzammil.biryanicooker.models.Air
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Muzammil on 17-Jan-20.
 */
@Module
class AirModule {
    
    @Provides
    @AirScope
    fun provideAir(@Named("airType") type: String): Air {
        return Air(type)
    }
}