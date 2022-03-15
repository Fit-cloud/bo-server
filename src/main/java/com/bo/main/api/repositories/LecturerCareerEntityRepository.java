package com.bo.main.api.repositories;

import com.bo.main.api.entities.LecturerCareerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LecturerCareerEntityRepository extends JpaRepository<LecturerCareerEntity, Long>, JpaSpecificationExecutor<LecturerCareerEntity> {

}
