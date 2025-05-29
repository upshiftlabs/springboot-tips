package com.upshiftlabs.springboot.tips.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/toggle/**", "/togglz-console/**").permitAll()  // ✅ Allow console access
                .anyRequest().authenticated()                   // 🔐 Secure other routes (optional)
                .and().csrf().disable();                        // 🚫 Disable CSRF for dev/testing
    }
}
