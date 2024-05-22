package com.company.project.controller;

import com.company.project.model.aggregate.Backlog;
import com.company.project.service.BacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/backlogs")
public class BacklogController {
    private final BacklogService backlogService;

    @Autowired
    public BacklogController(BacklogService backlogService) {
        this.backlogService = backlogService;
    }

    @GetMapping("/{id}")
    public Backlog getBacklog(@PathVariable UUID id) {
        return backlogService.getBacklogById(id);
    }

    @PostMapping
    public void createBacklog(@RequestBody Backlog backlog) {
        backlogService.createBacklog(backlog);
    }

    @DeleteMapping("/{id}")
    public void deleteBacklog(@PathVariable UUID id) {
        backlogService.deleteBacklog(id);
    }
}