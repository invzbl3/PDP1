package com.company.project.service;

import com.company.project.model.aggregate.Backlog;
import com.company.project.repository.BacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class BacklogService {
    private final BacklogRepository backlogRepository;

    @Autowired
    public BacklogService(BacklogRepository backlogRepository) {
        this.backlogRepository = backlogRepository;
    }

    public Backlog getBacklogById(UUID id) {
        return backlogRepository.findById(id);
    }

    public void createBacklog(Backlog backlog) {
        backlogRepository.save(backlog);
    }

    public void deleteBacklog(UUID id) {
        backlogRepository.delete(id);
    }
}