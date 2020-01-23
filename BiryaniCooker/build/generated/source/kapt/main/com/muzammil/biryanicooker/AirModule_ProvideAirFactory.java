package com.muzammil.biryanicooker;

import com.muzammil.biryanicooker.models.Air;
import dagger.internal.Factory;
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
public final class AirModule_ProvideAirFactory implements Factory<Air> {
  private final AirModule module;

  private final Provider<String> typeProvider;

  public AirModule_ProvideAirFactory(AirModule module, Provider<String> typeProvider) {
    this.module = module;
    this.typeProvider = typeProvider;
  }

  @Override
  public Air get() {
    return provideAir(module, typeProvider.get());
  }

  public static AirModule_ProvideAirFactory create(AirModule module,
      Provider<String> typeProvider) {
    return new AirModule_ProvideAirFactory(module, typeProvider);
  }

  public static Air provideAir(AirModule instance, String type) {
    return Preconditions.checkNotNull(instance.provideAir(type), "Cannot return null from a non-@Nullable @Provides method");
  }
}
