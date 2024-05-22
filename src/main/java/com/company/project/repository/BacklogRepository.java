package com.company.project.repository;

import com.company.project.model.aggregate.Backlog;
import java.util.UUID;

public interface BacklogRepository {
    Backlog findById(UUID id);
    void save(Backlog backlog);
    void delete(UUID id);
}