package com.muzammil.biryanicooker.models

import javax.inject.Inject

/**
 * Created by Muzammil on 16-Jan-20.
 */
class Cauldron @Inject constructor(val fire: Fire, val air: Air) : Pot, Printable {
    
    @set:Inject
    var fireAlt: Fire? = null
    @Inject
    lateinit var airAlt: Air
    
    override fun cook() {
        print()
        println("== Fire ==")
        fire.print()
        println("== Alt Fire ==")
        fireAlt?.print()
        println("== Air ==")
        air.print()
        println("== Alt Air ==")
        airAlt.print()
    }
    
    override fun print() {
        println("Thermos: ${uuid()}")
    }
}