package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.LecturerClassMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LecturerClassMappingRepository extends JpaRepository<LecturerClassMappingEntity, Long>, JpaSpecificationExecutor<LecturerClassMappingEntity> {

}
