package com.muzammil.biryanicooker.cooker;

import java.lang.System;

/**
 * Created by Muzammil on 17-Jan-20.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/muzammil/biryanicooker/cooker/CookerComponent;", "", "inject", "", "coffeeMaker", "Lcom/muzammil/biryanicooker/CoffeeMaker;", "Builder", "BiryaniCooker"})
@dagger.Component(modules = {com.muzammil.biryanicooker.cooker.CookerModule.class}, dependencies = {com.muzammil.biryanicooker.FireComponent.class})
@CookerScope()
public abstract interface CookerComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.muzammil.biryanicooker.CoffeeMaker coffeeMaker);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/muzammil/biryanicooker/cooker/CookerComponent$Builder;", "", "build", "Lcom/muzammil/biryanicooker/cooker/CookerComponent;", "fireComponent", "Lcom/muzammil/biryanicooker/FireComponent;", "BiryaniCooker"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.muzammil.biryanicooker.cooker.CookerComponent.Builder fireComponent(@org.jetbrains.annotations.NotNull()
        com.muzammil.biryanicooker.FireComponent fireComponent);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.muzammil.biryanicooker.cooker.CookerComponent build();
    }
}