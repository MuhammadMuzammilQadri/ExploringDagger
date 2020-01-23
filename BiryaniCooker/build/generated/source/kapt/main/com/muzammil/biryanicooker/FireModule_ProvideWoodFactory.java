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
public final class FireModule_ProvideWoodFactory implements Factory<Wood> {
  private static final FireModule_ProvideWoodFactory INSTANCE = new FireModule_ProvideWoodFactory();

  @Override
  public Wood get() {
    return provideWood();
  }

  public static FireModule_ProvideWoodFactory create() {
    return INSTANCE;
  }

  public static Wood provideWood() {
    return Preconditions.checkNotNull(FireModule.provideWood(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
