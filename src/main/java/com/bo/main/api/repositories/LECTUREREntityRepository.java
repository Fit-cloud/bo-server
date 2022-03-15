package com.bo.main.api.repositories;

import com.bo.main.api.entities.LecturerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LECTUREREntityRepository extends JpaRepository<LecturerEntity, Long>, JpaSpecificationExecutor<LecturerEntity> {

}
