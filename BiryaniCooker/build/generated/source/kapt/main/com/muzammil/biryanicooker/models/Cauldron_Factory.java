package com.muzammil.biryanicooker.models;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Cauldron_Factory implements Factory<Cauldron> {
  private final Provider<Fire> fireAltAndFireProvider;

  private final Provider<Air> airAltAndAirProvider;

  public Cauldron_Factory(Provider<Fire> fireAltAndFireProvider,
      Provider<Air> airAltAndAirProvider) {
    this.fireAltAndFireProvider = fireAltAndFireProvider;
    this.airAltAndAirProvider = airAltAndAirProvider;
  }

  @Override
  public Cauldron get() {
    Cauldron instance = new Cauldron(fireAltAndFireProvider.get(), airAltAndAirProvider.get());
    Cauldron_MembersInjector.injectFireAlt(instance, fireAltAndFireProvider.get());
    Cauldron_MembersInjector.injectAirAlt(instance, airAltAndAirProvider.get());
    return instance;
  }

  public static Cauldron_Factory create(Provider<Fire> fireAltAndFireProvider,
      Provider<Air> airAltAndAirProvider) {
    return new Cauldron_Factory(fireAltAndFireProvider, airAltAndAirProvider);
  }

  public static Cauldron newInstance(Fire fire, Air air) {
    return new Cauldron(fire, air);
  }
}
