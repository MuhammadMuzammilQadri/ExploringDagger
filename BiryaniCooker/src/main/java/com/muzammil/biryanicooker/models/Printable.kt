package com.muzammil.biryanicooker.models

/**
 * Created by Muzammil on 23-Jan-20.
 */
interface Printable {
    fun print()
    
    fun uuid() : String {
        return hashCode().toString()
    }
}