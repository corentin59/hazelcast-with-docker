package com.azelart.vlille;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Bootstrap
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.azelart.vlille"})
public class Application {

    /**
     * This is the main method for Spring Bootstrap.
     * @param args are somes args.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Configure Jersey Servlet.
     * @return a servlet registration bean
     */
    @Bean
    public ServletRegistrationBean jerseyServlet() {
        final ServletRegistrationBean registration = new ServletRegistrationBean(new com.sun.jersey.spi.spring.container.servlet.SpringServlet(), "/api/*");
        registration.addInitParameter("com.sun.jersey.config.property.packages", "com.azelart.vlille.ws");
        // our rest resources will be available in the path /rest/*
        //registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
        return registration;
    }


}
