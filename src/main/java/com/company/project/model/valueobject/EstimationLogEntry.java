package com.company.project.model.valueobject;

import lombok.Value;

@Value
public class EstimationLogEntry {
    private final String name;
    private final String description;
    private final int hoursRemaining;
    private final String volunteer;
}