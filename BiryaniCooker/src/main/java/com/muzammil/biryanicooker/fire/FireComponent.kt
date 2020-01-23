package com.muzammil.biryanicooker

import com.muzammil.biryanicooker.fire.FireScope
import com.muzammil.biryanicooker.models.Air
import com.muzammil.biryanicooker.models.Fire
import com.muzammil.biryanicooker.models.Wood
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Created by Muzammil on 17-Jan-20.
 */
@FireScope
@Component(modules = [FireModule::class],
           dependencies = [AirComponent::class])
interface FireComponent {
    
    fun provideFire(): Fire
    fun provideWood(): Wood
    fun provideAir(): Air
    
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun fireName(@Named("fireName")
                     name: String): Builder
        
        fun airComponent(airComponent: AirComponent): Builder
        
        fun build(): FireComponent
    }
}