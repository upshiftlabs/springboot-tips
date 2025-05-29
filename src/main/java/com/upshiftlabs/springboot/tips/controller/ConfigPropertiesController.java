package com.upshiftlabs.springboot.tips.controller;

import com.upshiftlabs.springboot.tips.config.AppConfigProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/config-based")
public class ConfigPropertiesController {

    private final AppConfigProperties config;

    public ConfigPropertiesController(AppConfigProperties config) {
        this.config = config;
    }

    @GetMapping("/config")
    public String getConfig() {
        return String.format("Name: %s, FeatureEnabled: %s, Timeout: %d",
                config.getName(), config.isFeatureEnabled(), config.getTimeout());
    }
}
