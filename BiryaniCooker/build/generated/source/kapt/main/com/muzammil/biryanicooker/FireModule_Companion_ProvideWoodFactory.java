package com.muzammil.biryanicooker;

import com.muzammil.biryanicooker.models.Wood;
import dagger.internal.Factory;
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
public final class FireModule_Companion_ProvideWoodFactory implements Factory<Wood> {
  private final FireModule.Companion module;

  public FireModule_Companion_ProvideWoodFactory(FireModule.Companion module) {
    this.module = module;
  }

  @Override
  public Wood get() {
    return provideWood(module);
  }

  public static FireModule_Companion_ProvideWoodFactory create(FireModule.Companion module) {
    return new FireModule_Companion_ProvideWoodFactory(module);
  }

  public static Wood provideWood(FireModule.Companion instance) {
    return Preconditions.checkNotNull(instance.provideWood(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
