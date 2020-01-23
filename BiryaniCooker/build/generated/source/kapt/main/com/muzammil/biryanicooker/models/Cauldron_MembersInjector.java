package com.muzammil.biryanicooker.models;

import dagger.MembersInjector;
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
public final class Cauldron_MembersInjector implements MembersInjector<Cauldron> {
  private final Provider<Fire> fireAltProvider;

  private final Provider<Air> airAltProvider;

  public Cauldron_MembersInjector(Provider<Fire> fireAltProvider, Provider<Air> airAltProvider) {
    this.fireAltProvider = fireAltProvider;
    this.airAltProvider = airAltProvider;
  }

  public static MembersInjector<Cauldron> create(Provider<Fire> fireAltProvider,
      Provider<Air> airAltProvider) {
    return new Cauldron_MembersInjector(fireAltProvider, airAltProvider);}

  @Override
  public void injectMembers(Cauldron instance) {
    injectFireAlt(instance, fireAltProvider.get());
    injectAirAlt(instance, airAltProvider.get());
  }

  public static void injectFireAlt(Cauldron instance, Fire fireAlt) {
    instance.fireAlt = fireAlt;
  }

  public static void injectAirAlt(Cauldron instance, Air airAlt) {
    instance.airAlt = airAlt;
  }
}
