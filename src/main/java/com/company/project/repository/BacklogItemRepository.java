package com.company.project.repository;

import com.company.project.model.entity.BacklogItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface BacklogItemRepository extends JpaRepository<BacklogItem, UUID> {
}