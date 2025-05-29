package com.upshiftlabs.springboot.tips.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.user.NoOpUserProvider;
import org.togglz.core.user.UserProvider;

@Configuration
public class TogglzConfig {
    @Bean
    public UserProvider userProvider() {
        // Replace this with a real implementation if needed
        return new NoOpUserProvider(); // works if you're not using user-specific feature toggles
    }
}
