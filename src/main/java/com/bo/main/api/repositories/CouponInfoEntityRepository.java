package com.bo.main.api.repositories;

import com.bo.main.api.entities.CouponInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CouponInfoEntityRepository extends JpaRepository<CouponInfoEntity, Long>, JpaSpecificationExecutor<CouponInfoEntity> {

}
