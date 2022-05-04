package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.ClassPackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassPackageRepository extends JpaRepository<ClassPackageEntity, Long>, JpaSpecificationExecutor<ClassPackageEntity> {

}
