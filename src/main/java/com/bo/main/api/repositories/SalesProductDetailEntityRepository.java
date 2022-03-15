package com.bo.main.api.repositories;

import com.bo.main.api.entities.SalesProductDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalesProductDetailEntityRepository extends JpaRepository<SalesProductDetailEntity, Void>, JpaSpecificationExecutor<SalesProductDetailEntity> {

}
