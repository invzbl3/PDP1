package com.company.project.repository;

import java.util.UUID;
import com.company.project.model.aggregate.Backlog;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository {
    Backlog findById(UUID id);
    void save(Backlog backlog);
    void delete(UUID id);
}