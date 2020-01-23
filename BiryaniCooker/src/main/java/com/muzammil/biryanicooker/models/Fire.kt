package com.muzammil.biryanicooker.models

/**
 * Created by Muzammil on 22-Jan-20.
 */
open class Fire(val name: String, val air: Air, val wood: Wood) : Printable {
    override fun print() {
        println("--- In Fire ---")
        println("Fire: $name, ${uuid()}")
        println("Air: ${air.uuid()}")
        println("Wood: ${wood.uuid()}")
    }
}