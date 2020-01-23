package com.muzammil.biryanicooker

import com.muzammil.biryanicooker.cooker.DaggerCookerComponent
import com.muzammil.biryanicooker.models.Pot
import javax.inject.Inject

/**
 * Created by Muzammil on 16-Jan-20.
 */

fun main() {
    BriyaniCooker().cookBriyani()
}

class BriyaniCooker {
    @Inject
    lateinit var pot: Pot
    
    constructor() {
        DaggerCookerComponent
                .builder()
                .fireComponent(DaggerFireComponent
                                       .builder()
                                       .fireName("Lava")
                                       .airComponent(DaggerAirComponent
                                                             .builder()
                                                             .airType("light")
                                                             .build())
                                       .build())
                .build()
                .inject(this)
    }
    
    fun cookBriyani() {
        pot.cook()
    }
}