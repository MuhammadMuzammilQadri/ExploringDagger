package com.muzammil.biryanicooker.models

import javax.inject.Inject

/**
 * Created by Muzammil on 22-Jan-20.
 */
class Wood @Inject constructor() : Printable {
    override fun print() {
        println("Wood: ${uuid()}")
    }
}