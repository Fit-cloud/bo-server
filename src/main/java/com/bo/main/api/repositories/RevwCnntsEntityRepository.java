package com.bo.main.api.repositories;

import com.bo.main.api.entities.RevwCnntsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RevwCnntsEntityRepository extends JpaRepository<RevwCnntsEntity, Long>, JpaSpecificationExecutor<RevwCnntsEntity> {

}
