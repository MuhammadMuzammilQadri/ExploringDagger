package com.muzammil.biryanicooker;

import com.muzammil.biryanicooker.models.Pot;
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
public final class CoffeeMaker_MembersInjector implements MembersInjector<CoffeeMaker> {
  private final Provider<Pot> pumpProvider;

  public CoffeeMaker_MembersInjector(Provider<Pot> pumpProvider) {
    this.pumpProvider = pumpProvider;
  }

  public static MembersInjector<CoffeeMaker> create(Provider<Pot> pumpProvider) {
    return new CoffeeMaker_MembersInjector(pumpProvider);}

  @Override
  public void injectMembers(CoffeeMaker instance) {
    injectPump(instance, pumpProvider.get());
  }

  public static void injectPump(CoffeeMaker instance, Pot pump) {
    instance.pump = pump;
  }
}
