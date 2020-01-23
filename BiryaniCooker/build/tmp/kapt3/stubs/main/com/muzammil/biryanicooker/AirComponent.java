package com.muzammil.biryanicooker;

import java.lang.System;

/**
 * Created by Muzammil on 17-Jan-20.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/muzammil/biryanicooker/AirComponent;", "", "provideAir", "Lcom/muzammil/biryanicooker/models/Air;", "Builder", "BiryaniCooker"})
@dagger.Component(modules = {com.muzammil.biryanicooker.AirModule.class})
@com.muzammil.biryanicooker.air.AirScope()
public abstract interface AirComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.muzammil.biryanicooker.models.Air provideAir();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/muzammil/biryanicooker/AirComponent$Builder;", "", "airType", "type", "", "build", "Lcom/muzammil/biryanicooker/AirComponent;", "BiryaniCooker"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.muzammil.biryanicooker.AirComponent.Builder airType(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "airType")
        java.lang.String type);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.muzammil.biryanicooker.AirComponent build();
    }
}