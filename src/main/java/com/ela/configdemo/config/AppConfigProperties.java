package com.ela.configdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppConfigProperties {
    private String name;
    private boolean featureEnabled;
    private int timeout;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isFeatureEnabled() { return featureEnabled; }
    public void setFeatureEnabled(boolean featureEnabled) { this.featureEnabled = featureEnabled; }

    public int getTimeout() { return timeout; }
    public void setTimeout(int timeout) { this.timeout = timeout; }
}
