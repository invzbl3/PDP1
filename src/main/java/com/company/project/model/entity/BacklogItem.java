package com.company.project.model.entity;

import lombok.Data;
import java.util.List;
import java.util.UUID;
import javax.persistence.*;
import lombok.NoArgsConstructor;
import com.company.project.model.aggregate.Backlog;
import com.company.project.model.valueobject.SprintID;
import com.company.project.model.valueobject.ProductID;
import com.company.project.model.valueobject.ReleaseID;

@Data
@Entity
@NoArgsConstructor
public class BacklogItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String status;
    private String story;
    private int storyPoints;
    private String summary;
    private String type;

    /**
     * 3. @ElementCollection Annotation
     * <p>
     * If ProductID, ReleaseID and SprintID are simple values,
     * you can use the @ElementCollection annotation.
     */
    @Embedded
    private ProductID productID;
    @Embedded
    private ReleaseID releaseID;
    @Embedded
    private SprintID sprintID;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks;

    @ManyToOne
    private Backlog backlog;

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