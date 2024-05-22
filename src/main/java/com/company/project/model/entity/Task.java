package com.company.project.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class Task {
    private String name;
    private String id;
    private String description;
    private int hoursRemaining;
    private String volunteer;
    private List<EstimationLogEntry> estimationLogEntries;

    public Task(String name, String id, String description, int hoursRemaining, String volunteer) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.hoursRemaining = hoursRemaining;
        this.volunteer = volunteer;
    }
}