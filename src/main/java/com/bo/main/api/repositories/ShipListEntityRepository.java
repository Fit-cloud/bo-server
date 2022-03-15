package com.bo.main.api.repositories;

import com.bo.main.api.entities.ShipListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ShipListEntityRepository extends JpaRepository<ShipListEntity, Long>, JpaSpecificationExecutor<ShipListEntity> {

}
