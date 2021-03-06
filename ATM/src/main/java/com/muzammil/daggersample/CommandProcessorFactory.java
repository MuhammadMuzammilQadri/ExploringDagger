package com.muzammil.daggersample;/*
 * Copyright (C) 2019 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import dagger.Component;

import javax.inject.Singleton;

/**
 * Hand-written API for interfacing with Dagger. The command-line ATM needs a single class to
 * execute: {@link CommandProcessor}.
 *
 * <p>The list of {@code modules} declares where Dagger should look, besides {@link
 * javax.inject.Inject}-annotated constructors, to help instantiate {@link CommandProcessor} and its
 * dependencies.
 */
@Singleton
@Component(
        modules = {
                CommandsModule.class,
                InMemoryDatabaseModule.class,
                UserCommandsRouter.InstallationModule.class,
                SystemOutModule.class,
        })
public interface CommandProcessorFactory {
    CommandProcessor commandProcessor();

    Outputter outputter();

    static CommandProcessorFactory create() {
        return DaggerCommandProcessorFactory.create();
    }
}
