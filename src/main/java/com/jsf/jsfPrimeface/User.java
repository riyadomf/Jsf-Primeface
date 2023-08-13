package com.jsf.jsfPrimeface;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;


@RequestScoped
@Named(value = "user")
public class User implements Serializable{
    @Inject
    private GreetingService greetingService;

    private String name;
    String greeting;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }
    public void doGreeting() {
        greeting = String.format( greetingService.getGreetingTemplate(null) , name );
    }
}