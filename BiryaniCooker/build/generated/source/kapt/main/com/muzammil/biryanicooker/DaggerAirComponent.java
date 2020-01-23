package com.muzammil.biryanicooker;

import com.muzammil.biryanicooker.models.Air;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
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
public final class DaggerAirComponent implements AirComponent {
  private Provider<String> airTypeProvider;

  private Provider<Air> provideAirProvider;

  private DaggerAirComponent(AirModule airModuleParam, String airTypeParam) {

    initialize(airModuleParam, airTypeParam);
  }

  public static AirComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AirModule airModuleParam, final String airTypeParam) {
    this.airTypeProvider = InstanceFactory.create(airTypeParam);
    this.provideAirProvider = DoubleCheck.provider(AirModule_ProvideAirFactory.create(airModuleParam, airTypeProvider));
  }

  @Override
  public Air provideAir() {
    return provideAirProvider.get();}

  private static final class Builder implements AirComponent.Builder {
    private String airType;

    @Override
    public Builder airType(String type) {
      this.airType = Preconditions.checkNotNull(type);
      return this;
    }

    @Override
    public AirComponent build() {
      Preconditions.checkBuilderRequirement(airType, String.class);
      return new DaggerAirComponent(new AirModule(), airType);
    }
  }
}
