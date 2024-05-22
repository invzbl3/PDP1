package com.company.project.model.aggregate;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Backlog {
    private UUID id;
    private String name;
    private String description;
    private List<BacklogItem> backlogItems;

    public Backlog(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}