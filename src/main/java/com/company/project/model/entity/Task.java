package com.company.project.model.entity;

import lombok.Data;
import java.util.List;
import java.util.UUID;
import lombok.NoArgsConstructor;
import com.company.project.model.valueobject.EstimationLogEntry;

@Data
@NoArgsConstructor
public class Task {
    private UUID id;
    private String name;
    private String description;
    private int hoursRemaining;
    private String volunteer;
    private List<EstimationLogEntry> estimationLogEntries;

    public Task(UUID id, String name, String description, int hoursRemaining, String volunteer) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hoursRemaining = hoursRemaining;
        this.volunteer = volunteer;
    }
}