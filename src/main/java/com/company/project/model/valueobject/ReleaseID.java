package com.company.project.model.valueobject;

import lombok.Value;
import java.util.UUID;
import javax.persistence.Embeddable;

@Value
@Embeddable
public class ReleaseID {
    UUID id;

    public ReleaseID() {
        this.id = UUID.randomUUID();
    }

    public ReleaseID(UUID id) {
        this.id = id;
    }
}