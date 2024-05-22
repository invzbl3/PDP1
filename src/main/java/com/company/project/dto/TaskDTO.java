package com.company.project.dto;

import lombok.Data;
import java.util.List;
import java.util.UUID;

@Data
public class TaskDTO {
    private UUID id;
    private String name;
    private String description;
    private int hoursRemaining;
    private String volunteer;
    private List<EstimationLogEntryDTO> estimationLogEntries;
}