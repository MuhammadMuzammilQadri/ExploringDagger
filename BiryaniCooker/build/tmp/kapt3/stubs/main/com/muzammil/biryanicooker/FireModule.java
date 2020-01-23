package com.muzammil.biryanicooker;

import java.lang.System;

/**
 * Created by Muzammil on 17-Jan-20.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\'\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/muzammil/biryanicooker/FireModule;", "", "()V", "Companion", "BiryaniCooker"})
@dagger.Module()
public abstract class FireModule {
    public static final com.muzammil.biryanicooker.FireModule.Companion Companion = null;
    
    public FireModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.muzammil.biryanicooker.fire.FireScope()
    @dagger.Provides()
    public static final com.muzammil.biryanicooker.models.Wood provideWood() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.muzammil.biryanicooker.fire.FireScope()
    @dagger.Provides()
    public static final com.muzammil.biryanicooker.models.Fire provideFire(@org.jetbrains.annotations.NotNull()
    com.muzammil.biryanicooker.models.Air air, @org.jetbrains.annotations.NotNull()
    com.muzammil.biryanicooker.models.Wood wood) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/muzammil/biryanicooker/FireModule$Companion;", "", "()V", "provideFire", "Lcom/muzammil/biryanicooker/models/Fire;", "air", "Lcom/muzammil/biryanicooker/models/Air;", "wood", "Lcom/muzammil/biryanicooker/models/Wood;", "provideWood", "BiryaniCooker"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @com.muzammil.biryanicooker.fire.FireScope()
        @dagger.Provides()
        public final com.muzammil.biryanicooker.models.Wood provideWood() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @com.muzammil.biryanicooker.fire.FireScope()
        @dagger.Provides()
        public final com.muzammil.biryanicooker.models.Fire provideFire(@org.jetbrains.annotations.NotNull()
        com.muzammil.biryanicooker.models.Air air, @org.jetbrains.annotations.NotNull()
        com.muzammil.biryanicooker.models.Wood wood) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}