package com.muzammil.biryanicooker.models

/**
 * Created by Muzammil on 22-Jan-20.
 */
class Air(val type: String) : Printable {
    override fun print() {
        println("Air: ${uuid()}")
    }
}