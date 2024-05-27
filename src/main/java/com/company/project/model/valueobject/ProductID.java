package com.company.project.model.valueobject;

import lombok.Data;
import java.util.UUID;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class ProductID {

    private UUID id;

    public ProductID() {
        this.id = UUID.randomUUID();
    }

    public ProductID(UUID id) {
        this.id = id;
    }
}