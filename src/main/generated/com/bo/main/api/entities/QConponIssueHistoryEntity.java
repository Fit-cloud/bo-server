package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QConponIssueHistoryEntity is a Querydsl query type for ConponIssueHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConponIssueHistoryEntity extends EntityPathBase<ConponIssueHistoryEntity> {

    private static final long serialVersionUID = 525397667L;

    public static final QConponIssueHistoryEntity conponIssueHistoryEntity = new QConponIssueHistoryEntity("conponIssueHistoryEntity");

    public final NumberPath<Long> cpnNo = createNumber("cpnNo", Long.class);

    public final DateTimePath<java.util.Date> issueDtm = createDateTime("issueDtm", java.util.Date.class);

    public final NumberPath<Long> mbrId = createNumber("mbrId", Long.class);

    public final DateTimePath<java.util.Date> useDtm = createDateTime("useDtm", java.util.Date.class);

    public final StringPath useSppdCd = createString("useSppdCd");

    public final DateTimePath<java.util.Date> useSppdDtm = createDateTime("useSppdDtm", java.util.Date.class);

    public QConponIssueHistoryEntity(String variable) {
        super(ConponIssueHistoryEntity.class, forVariable(variable));
    }

    public QConponIssueHistoryEntity(Path<? extends ConponIssueHistoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConponIssueHistoryEntity(PathMetadata metadata) {
        super(ConponIssueHistoryEntity.class, metadata);
    }

}

