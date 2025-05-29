package com.upshiftlabs.springboot.tips.logging;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

public enum LogFeatures implements Feature {

    @EnabledByDefault
    @Label("Enable PII Masking in Logs")
    MASK_PII_LOGGING;
}
