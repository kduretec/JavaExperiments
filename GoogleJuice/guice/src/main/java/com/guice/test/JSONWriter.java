package com.guice.test;

public class JSONWriter implements Writer {

    @Override
    public void write() {
        System.out.println("I am writing to JSON");
    }
}
