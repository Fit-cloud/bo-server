package com.bo.main.api.repositories;

import com.bo.main.api.entities.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderDetailEntityRepository extends JpaRepository<OrderDetailEntity, String>, JpaSpecificationExecutor<OrderDetailEntity> {

}
