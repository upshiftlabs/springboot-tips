package com.upshiftlabs.springboot.tips.logging.controller;

import com.upshiftlabs.springboot.tips.logging.LogFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.togglz.core.context.FeatureContext;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LogController {

    private static final Logger log = LoggerFactory.getLogger(LogController.class);

    @PostMapping("/submit")
    public String submitData(@RequestBody Map<String, String> payload) {
        Map<String, String> logData = new HashMap<>(payload);

        if (FeatureContext.getFeatureManager().isActive(LogFeatures.MASK_PII_LOGGING)) {
            maskPII(logData);
        }

        log.info("Request received: {}", logData);
        return "Data received";
    }

    private void maskPII(Map<String, String> data) {
        if (data.containsKey("email")) {
            data.put("email", data.get("email").replaceAll("(?<=.{2}).(?=[^@]*?@)", "*"));
        }
        if (data.containsKey("phone")) {
            data.put("phone", data.get("phone").replaceAll(".(?=.{2})", "*"));
        }
    }
}

