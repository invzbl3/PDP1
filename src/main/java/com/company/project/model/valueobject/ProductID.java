package com.company.project.model.valueobject;

import lombok.Data;
import javax.persistence.Embeddable;
import java.util.UUID;

@Data
@Embeddable
public class ProductID {

    private UUID id;

    public ProductID() {}

    public ProductID(UUID id) {
        this.id = id;
    }
}