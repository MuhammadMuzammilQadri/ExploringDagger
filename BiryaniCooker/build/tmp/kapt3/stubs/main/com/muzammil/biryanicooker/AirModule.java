package com.muzammil.biryanicooker;

import java.lang.System;

/**
 * Created by Muzammil on 17-Jan-20.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/muzammil/biryanicooker/AirModule;", "", "()V", "provideAir", "Lcom/muzammil/biryanicooker/models/Air;", "type", "", "BiryaniCooker"})
@dagger.Module()
public final class AirModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.muzammil.biryanicooker.air.AirScope()
    @dagger.Provides()
    public final com.muzammil.biryanicooker.models.Air provideAir(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "airType")
    java.lang.String type) {
        return null;
    }
    
    public AirModule() {
        super();
    }
}