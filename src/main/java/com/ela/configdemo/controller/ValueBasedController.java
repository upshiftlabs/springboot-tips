package com.ela.configdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueBasedController {

    @Value("${app.name}")
    private String name;

    @Value("${app.feature-enabled}")
    private boolean featureEnabled;

    @Value("${app.timeout}")
    private int timeout;

    @GetMapping("/value")
    public String getValueConfig() {
        return String.format("Name: %s, FeatureEnabled: %s, Timeout: %d", name, featureEnabled, timeout);
    }
}
