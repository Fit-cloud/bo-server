package com.bo.main.api.repositories;

import com.bo.main.api.entities.OrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderInfoEntityRepository extends JpaRepository<OrderInfoEntity, Long>, JpaSpecificationExecutor<OrderInfoEntity> {

}
