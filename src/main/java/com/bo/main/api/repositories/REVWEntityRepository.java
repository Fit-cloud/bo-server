package com.bo.main.api.repositories;

import com.bo.main.api.entities.RevwEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface REVWEntityRepository extends JpaRepository<RevwEntity, Long>, JpaSpecificationExecutor<RevwEntity> {

}
