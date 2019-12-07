package com.test.embbeded.tomcat;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.ServletException;
import java.io.File;

public class Main {

    public static void main(String[] args) throws LifecycleException, ServletException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context context = tomcat.addWebapp("/", new File(".").getAbsolutePath());

        Tomcat.addServlet(context, "jersey-container-servlet", resourceConfig());
        context.addServletMapping("/*", "jersey-container-servlet");

        tomcat.start();
        tomcat.getServer().await();
    }

    private static ServletContainer resourceConfig() {
        return new ServletContainer(new ResourceConfig(new ResourceLoader().getClasses()));
    }
}
