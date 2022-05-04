package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRevwEntity is a Querydsl query type for RevwEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRevwEntity extends EntityPathBase<RevwEntity> {

    private static final long serialVersionUID = -260156369L;

    public static final QRevwEntity revwEntity = new QRevwEntity("revwEntity");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final StringPath REVW = createString("REVW");

    public final NumberPath<Long> revwSeq = createNumber("revwSeq", Long.class);

    public final NumberPath<Long> slsPrdtSeq = createNumber("slsPrdtSeq", Long.class);

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QRevwEntity(String variable) {
        super(RevwEntity.class, forVariable(variable));
    }

    public QRevwEntity(Path<? extends RevwEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRevwEntity(PathMetadata metadata) {
        super(RevwEntity.class, metadata);
    }

}

