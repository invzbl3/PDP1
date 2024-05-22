package com.company.project.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class BacklogItem {
    private String status;
    private String story;
    private int storyPoints;
    private String summary;
    private String type;
    private ProductID productID;
    private ReleaseID releaseID;
    private SprintID sprintID;
    private List<Task> tasks;

    public BacklogItem(String status, String story, int storyPoints,
                       String summary, String type, ProductID productID,
                       ReleaseID releaseID, SprintID sprintID) {
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