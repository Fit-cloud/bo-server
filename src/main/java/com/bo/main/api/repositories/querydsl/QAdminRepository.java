package com.bo.main.api.repositories.querydsl;

import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.vo.AdminVo;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.bo.main.api.entities.QAdminEntity.adminEntity;

@RequiredArgsConstructor
@Repository
public class QAdminRepository {
    private final JPAQueryFactory queryFactory;


    public List<AdminEntity> findAll() {
        return queryFactory.selectFrom(adminEntity)
                .fetch();
    }
}
