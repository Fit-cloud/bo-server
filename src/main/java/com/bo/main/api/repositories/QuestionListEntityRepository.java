package com.bo.main.api.repositories;

import com.bo.main.api.entities.QuestionListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QuestionListEntityRepository extends JpaRepository<QuestionListEntity, Long>, JpaSpecificationExecutor<QuestionListEntity> {

}
