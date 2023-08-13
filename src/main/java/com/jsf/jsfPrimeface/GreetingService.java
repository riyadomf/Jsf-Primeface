package com.jsf.jsfPrimeface;

import  jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String getGreetingTemplate(String language) {
        String result = "Hello %s!";
        return result;
    }
}


