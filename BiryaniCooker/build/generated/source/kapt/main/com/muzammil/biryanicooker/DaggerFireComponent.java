package com.muzammil.biryanicooker;

import com.muzammil.biryanicooker.models.Air;
import com.muzammil.biryanicooker.models.Fire;
import com.muzammil.biryanicooker.models.Wood;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
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
public final class DaggerFireComponent implements FireComponent {
  private final AirComponent airComponent;

  private Provider<Air> provideAirProvider;

  private Provider<Wood> provideWoodProvider;

  private Provider<Fire> provideFireProvider;

  private DaggerFireComponent(AirComponent airComponentParam, String fireName) {
    this.airComponent = airComponentParam;
    initialize(airComponentParam, fireName);
  }

  public static FireComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AirComponent airComponentParam, final String fireName) {
    this.provideAirProvider = new com_muzammil_biryanicooker_AirComponent_provideAir(airComponentParam);
    this.provideWoodProvider = DoubleCheck.provider(FireModule_ProvideWoodFactory.create());
    this.provideFireProvider = DoubleCheck.provider(FireModule_ProvideFireFactory.create(provideAirProvider, provideWoodProvider));
  }

  @Override
  public Fire provideFire() {
    return provideFireProvider.get();}

  @Override
  public Wood provideWood() {
    return provideWoodProvider.get();}

  @Override
  public Air provideAir() {
    return Preconditions.checkNotNull(airComponent.provideAir(), "Cannot return null from a non-@Nullable component method");}

  private static final class Builder implements FireComponent.Builder {
    private String fireName;

    private AirComponent airComponent;

    @Override
    public Builder fireName(String name) {
      this.fireName = Preconditions.checkNotNull(name);
      return this;
    }

    @Override
    public Builder airComponent(AirComponent airComponent) {
      this.airComponent = Preconditions.checkNotNull(airComponent);
      return this;
    }

    @Override
    public FireComponent build() {
      Preconditions.checkBuilderRequirement(fireName, String.class);
      Preconditions.checkBuilderRequirement(airComponent, AirComponent.class);
      return new DaggerFireComponent(airComponent, fireName);
    }
  }

  private static class com_muzammil_biryanicooker_AirComponent_provideAir implements Provider<Air> {
    private final AirComponent airComponent;

    com_muzammil_biryanicooker_AirComponent_provideAir(AirComponent airComponent) {
      this.airComponent = airComponent;
    }

    @Override
    public Air get() {
      return Preconditions.checkNotNull(airComponent.provideAir(), "Cannot return null from a non-@Nullable component method");
    }
  }
}
