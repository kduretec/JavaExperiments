package com.guice.test;

import com.google.inject.AbstractModule;

public class WriterModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Writer.class).to(JSONWriter.class);
    }
}
