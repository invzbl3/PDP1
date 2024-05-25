package com.company.project.repository;

import java.util.UUID;
import com.company.project.model.entity.BacklogItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BacklogItemRepository extends JpaRepository<BacklogItem, UUID> {
}