package com.company.project.model.valueobject;

import lombok.Value;
import java.util.UUID;
import javax.persistence.Embeddable;

@Value
@Embeddable
public class SprintID {
    UUID id;

    public SprintID() {
        this.id = UUID.randomUUID();
    }

    public SprintID(UUID id) {
        this.id = id;
    }
}