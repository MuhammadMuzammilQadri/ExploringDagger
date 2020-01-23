package com.muzammil.biryanicooker.cooker

import com.muzammil.biryanicooker.BriyaniCooker
import com.muzammil.biryanicooker.FireComponent
import dagger.Component

/**
 * Created by Muzammil on 17-Jan-20.
 */
@CookerScope
@Component(modules = [CookerModule::class],
           dependencies = [FireComponent::class])
interface CookerComponent {
    fun inject(briyaniCooker: BriyaniCooker)
    
    @Component.Builder
    interface Builder {
        fun fireComponent(fireComponent: FireComponent): Builder
        
        fun build(): CookerComponent
    }
    
}