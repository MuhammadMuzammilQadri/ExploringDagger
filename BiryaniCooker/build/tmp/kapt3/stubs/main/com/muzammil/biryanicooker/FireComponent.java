package com.muzammil.biryanicooker;

import java.lang.System;

/**
 * Created by Muzammil on 17-Jan-20.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/muzammil/biryanicooker/FireComponent;", "", "provideAir", "Lcom/muzammil/biryanicooker/models/Air;", "provideFire", "Lcom/muzammil/biryanicooker/models/Fire;", "provideWood", "Lcom/muzammil/biryanicooker/models/Wood;", "Builder", "BiryaniCooker"})
@dagger.Component(modules = {com.muzammil.biryanicooker.FireModule.class}, dependencies = {com.muzammil.biryanicooker.AirComponent.class})
@com.muzammil.biryanicooker.fire.FireScope()
public abstract interface FireComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.muzammil.biryanicooker.models.Fire provideFire();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.muzammil.biryanicooker.models.Wood provideWood();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.muzammil.biryanicooker.models.Air provideAir();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/muzammil/biryanicooker/FireComponent$Builder;", "", "airComponent", "Lcom/muzammil/biryanicooker/AirComponent;", "build", "Lcom/muzammil/biryanicooker/FireComponent;", "fireName", "name", "", "BiryaniCooker"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.muzammil.biryanicooker.FireComponent.Builder fireName(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "fireName")
        java.lang.String name);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.muzammil.biryanicooker.FireComponent.Builder airComponent(@org.jetbrains.annotations.NotNull()
        com.muzammil.biryanicooker.AirComponent airComponent);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.muzammil.biryanicooker.FireComponent build();
    }
}