package com.bo.main.api.repositories;

import com.bo.main.api.entities.ShippingProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ShippingProductEntityRepository extends JpaRepository<ShippingProductEntity, Long>, JpaSpecificationExecutor<ShippingProductEntity> {

}
