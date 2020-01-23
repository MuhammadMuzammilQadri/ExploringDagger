package com.muzammil.biryanicooker.cooker

import com.muzammil.biryanicooker.CoffeeMaker
import com.muzammil.biryanicooker.FireComponent
import dagger.Component

/**
 * Created by Muzammil on 17-Jan-20.
 */
@CookerScope
@Component(modules = [CookerModule::class],
           dependencies = [FireComponent::class])
interface CookerComponent {
    fun inject(coffeeMaker: CoffeeMaker)
    
    @Component.Builder
    interface Builder {
        fun fireComponent(fireComponent: FireComponent): Builder
        
        fun build(): CookerComponent
    }
    
}