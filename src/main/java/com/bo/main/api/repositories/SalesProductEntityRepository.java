package com.bo.main.api.repositories;

import com.bo.main.api.entities.SalesProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalesProductEntityRepository extends JpaRepository<SalesProductEntity, Long>, JpaSpecificationExecutor<SalesProductEntity> {

}
