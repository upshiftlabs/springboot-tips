package com.upshiftlabs.springboot.tips.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.context.FeatureContext;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.repository.FeatureState;

@RestController
@RequestMapping("/feature")
public class ToggleController {

    @PostMapping("/toggle/{feature}/{status}")
    public String toggleFeature(@PathVariable String feature, @PathVariable boolean status) {
        FeatureManager manager = FeatureContext.getFeatureManager();
        Feature f = manager.getFeatures().stream()
                .filter(feat -> feat.name().equalsIgnoreCase(feature))
                .findFirst()
                .orElseThrow();

        manager.setFeatureState(new FeatureState(f, status));
        return "Toggled " + feature + " to " + status;
    }

}
