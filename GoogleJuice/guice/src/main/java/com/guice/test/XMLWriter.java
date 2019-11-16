package com.guice.test;

public class XMLWriter implements Writer{

    @Override
    public void write() {
        System.out.println("I am writting to XML");
    }
}
