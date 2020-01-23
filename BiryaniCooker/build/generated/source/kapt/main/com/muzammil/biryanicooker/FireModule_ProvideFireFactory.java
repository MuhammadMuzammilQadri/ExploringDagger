package com.muzammil.biryanicooker;

import com.muzammil.biryanicooker.models.Air;
import com.muzammil.biryanicooker.models.Fire;
import com.muzammil.biryanicooker.models.Wood;
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
public final class FireModule_ProvideFireFactory implements Factory<Fire> {
  private final Provider<Air> airProvider;

  private final Provider<Wood> woodProvider;

  public FireModule_ProvideFireFactory(Provider<Air> airProvider, Provider<Wood> woodProvider) {
    this.airProvider = airProvider;
    this.woodProvider = woodProvider;
  }

  @Override
  public Fire get() {
    return provideFire(airProvider.get(), woodProvider.get());
  }

  public static FireModule_ProvideFireFactory create(Provider<Air> airProvider,
      Provider<Wood> woodProvider) {
    return new FireModule_ProvideFireFactory(airProvider, woodProvider);
  }

  public static Fire provideFire(Air air, Wood wood) {
    return Preconditions.checkNotNull(FireModule.provideFire(air, wood), "Cannot return null from a non-@Nullable @Provides method");
  }
}
