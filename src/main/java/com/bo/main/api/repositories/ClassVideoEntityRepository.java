package com.bo.main.api.repositories;

import com.bo.main.api.entities.ClassVideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassVideoEntityRepository extends JpaRepository<ClassVideoEntity, Long>, JpaSpecificationExecutor<ClassVideoEntity> {

}
