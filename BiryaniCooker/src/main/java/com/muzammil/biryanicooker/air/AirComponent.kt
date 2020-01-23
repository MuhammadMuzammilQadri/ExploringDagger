package com.muzammil.biryanicooker

import com.muzammil.biryanicooker.air.AirScope
import com.muzammil.biryanicooker.models.Air
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Created by Muzammil on 17-Jan-20.
 */
@AirScope
@Component(modules = [AirModule::class])
interface AirComponent {
    
    fun provideAir(): Air
    
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun airType(@Named("airType")
                    type: String): Builder
        
        fun build(): AirComponent
    }
}