package com.company.project.model.entity;

import lombok.Data;
import java.util.List;
import java.util.UUID;
import lombok.NoArgsConstructor;
import com.company.project.model.valueobject.SprintID;
import com.company.project.model.valueobject.ProductID;
import com.company.project.model.valueobject.ReleaseID;

@Data
@NoArgsConstructor
public class BacklogItem {
    private UUID id;
    private String status;
    private String story;
    private int storyPoints;
    private String summary;
    private String type;
    private ProductID productID;
    private ReleaseID releaseID;
    private SprintID sprintID;
    private List<Task> tasks;

    public BacklogItem(UUID id, String status, String story, int storyPoints,
                       String summary, String type, ProductID productID,
                       ReleaseID releaseID, SprintID sprintID) {
        this.id = id;
        this.status = status;
        this.story = story;
        this.storyPoints = storyPoints;
        this.summary = summary;
        this.type = type;
        this.productID = productID;
        this.releaseID = releaseID;
        this.sprintID = sprintID;
    }
}