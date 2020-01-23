package com.muzammil.biryanicooker.cooker;

import com.muzammil.biryanicooker.CoffeeMaker;
import com.muzammil.biryanicooker.CoffeeMaker_MembersInjector;
import com.muzammil.biryanicooker.FireComponent;
import com.muzammil.biryanicooker.models.Cauldron;
import com.muzammil.biryanicooker.models.Cauldron_Factory;
import com.muzammil.biryanicooker.models.Cauldron_MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCookerComponent implements CookerComponent {
  private final FireComponent fireComponent;

  private DaggerCookerComponent(FireComponent fireComponentParam) {
    this.fireComponent = fireComponentParam;
  }

  public static CookerComponent.Builder builder() {
    return new Builder();
  }

  private Cauldron getCauldron() {
    return injectCauldron(Cauldron_Factory.newInstance(Preconditions.checkNotNull(fireComponent.provideFire(), "Cannot return null from a non-@Nullable component method"), Preconditions.checkNotNull(fireComponent.provideAir(), "Cannot return null from a non-@Nullable component method")));}

  @Override
  public void inject(CoffeeMaker coffeeMaker) {
    injectCoffeeMaker(coffeeMaker);}

  private Cauldron injectCauldron(Cauldron instance) {
    Cauldron_MembersInjector.injectFireAlt(instance, Preconditions.checkNotNull(fireComponent.provideFire(), "Cannot return null from a non-@Nullable component method"));
    Cauldron_MembersInjector.injectAirAlt(instance, Preconditions.checkNotNull(fireComponent.provideAir(), "Cannot return null from a non-@Nullable component method"));
    return instance;
  }

  private CoffeeMaker injectCoffeeMaker(CoffeeMaker instance) {
    CoffeeMaker_MembersInjector.injectPump(instance, getCauldron());
    return instance;
  }

  private static final class Builder implements CookerComponent.Builder {
    private FireComponent fireComponent;

    @Override
    public Builder fireComponent(FireComponent fireComponent) {
      this.fireComponent = Preconditions.checkNotNull(fireComponent);
      return this;
    }

    @Override
    public CookerComponent build() {
      Preconditions.checkBuilderRequirement(fireComponent, FireComponent.class);
      return new DaggerCookerComponent(fireComponent);
    }
  }
}
