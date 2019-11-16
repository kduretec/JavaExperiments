package com.guice.test;

import com.google.inject.Inject;

public class WriterService {

    Writer writer;

    @Inject
    public WriterService(Writer w) {
        writer = w;
    }

    public void write() {
        writer.write();
    }
}
