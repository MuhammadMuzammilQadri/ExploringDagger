package com.muzammil.biryanicooker.models;

import java.lang.System;

/**
 * Created by Muzammil on 23-Jan-20.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/muzammil/biryanicooker/models/Printable;", "", "print", "", "uuid", "", "BiryaniCooker"})
public abstract interface Printable {
    
    public abstract void print();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String uuid();
    
    /**
     * Created by Muzammil on 23-Jan-20.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.String uuid(com.muzammil.biryanicooker.models.Printable $this) {
            return null;
        }
    }
}