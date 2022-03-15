package com.bo.main.api.repositories;

import com.bo.main.api.entities.ConponIssueHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ConponIssueHistoryEntityRepository extends JpaRepository<ConponIssueHistoryEntity, Long>, JpaSpecificationExecutor<ConponIssueHistoryEntity> {

}
