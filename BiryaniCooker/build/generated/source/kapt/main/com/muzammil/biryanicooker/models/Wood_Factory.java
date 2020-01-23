package com.muzammil.biryanicooker.models;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Wood_Factory implements Factory<Wood> {
  private static final Wood_Factory INSTANCE = new Wood_Factory();

  @Override
  public Wood get() {
    return new Wood();
  }

  public static Wood_Factory create() {
    return INSTANCE;
  }

  public static Wood newInstance() {
    return new Wood();
  }
}
