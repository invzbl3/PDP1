package com.company.project.repository;

import java.util.UUID;
import com.company.project.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, UUID> {
}