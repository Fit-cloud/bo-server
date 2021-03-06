package com.bo.main.api.repositories.jpa;

import com.bo.main.api.entities.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<AdminEntity, Long>, JpaSpecificationExecutor<AdminEntity> {
    Optional<AdminEntity> findByAdmId(String adminId);
}
