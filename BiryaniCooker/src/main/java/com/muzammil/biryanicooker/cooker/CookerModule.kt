package com.muzammil.biryanicooker.cooker

import com.muzammil.biryanicooker.models.Pot
import com.muzammil.biryanicooker.models.Cauldron
import dagger.Binds
import dagger.Module

/**
 * Created by Muzammil on 17-Jan-20.
 */
@Module
abstract class CookerModule {
    @Binds
    abstract fun provideCauldron(cauldron: Cauldron): Pot
}