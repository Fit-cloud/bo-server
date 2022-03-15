package com.bo.main.api.repositories;

import com.bo.main.api.entities.ClassBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassBaseEntityRepository extends JpaRepository<ClassBaseEntity, Long>, JpaSpecificationExecutor<ClassBaseEntity> {

}
