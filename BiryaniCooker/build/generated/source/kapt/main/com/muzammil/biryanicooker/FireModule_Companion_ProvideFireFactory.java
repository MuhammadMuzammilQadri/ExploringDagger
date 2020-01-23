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
public final class FireModule_Companion_ProvideFireFactory implements Factory<Fire> {
  private final FireModule.Companion module;

  private final Provider<Air> airProvider;

  private final Provider<Wood> woodProvider;

  public FireModule_Companion_ProvideFireFactory(FireModule.Companion module,
      Provider<Air> airProvider, Provider<Wood> woodProvider) {
    this.module = module;
    this.airProvider = airProvider;
    this.woodProvider = woodProvider;
  }

  @Override
  public Fire get() {
    return provideFire(module, airProvider.get(), woodProvider.get());
  }

  public static FireModule_Companion_ProvideFireFactory create(FireModule.Companion module,
      Provider<Air> airProvider, Provider<Wood> woodProvider) {
    return new FireModule_Companion_ProvideFireFactory(module, airProvider, woodProvider);
  }

  public static Fire provideFire(FireModule.Companion instance, Air air, Wood wood) {
    return Preconditions.checkNotNull(instance.provideFire(air, wood), "Cannot return null from a non-@Nullable @Provides method");
  }
}
