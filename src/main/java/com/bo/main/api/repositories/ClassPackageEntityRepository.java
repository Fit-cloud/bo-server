package com.bo.main.api.repositories;

import com.bo.main.api.entities.ClassPackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassPackageEntityRepository extends JpaRepository<ClassPackageEntity, Long>, JpaSpecificationExecutor<ClassPackageEntity> {

}
