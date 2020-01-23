package com.muzammil.biryanicooker

import com.muzammil.biryanicooker.fire.FireScope
import com.muzammil.biryanicooker.models.Air
import com.muzammil.biryanicooker.models.Fire
import com.muzammil.biryanicooker.models.Lava
import com.muzammil.biryanicooker.models.Wood
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Muzammil on 17-Jan-20.
 */
@Module
abstract class FireModule {
    
    @Module
    companion object {
        
        @Provides
        @JvmStatic
        @FireScope
        fun provideWood() : Wood {
            return Wood()
        }
        
        @Provides
        @JvmStatic
        fun provideFire(air: Air, wood: Wood): Fire {
            return Lava("lava", air, wood)
        }
    }
    
}