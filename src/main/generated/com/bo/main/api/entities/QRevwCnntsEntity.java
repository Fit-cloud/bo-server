package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRevwCnntsEntity is a Querydsl query type for RevwCnntsEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRevwCnntsEntity extends EntityPathBase<RevwCnntsEntity> {

    private static final long serialVersionUID = -1586163495L;

    public static final QRevwCnntsEntity revwCnntsEntity = new QRevwCnntsEntity("revwCnntsEntity");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final StringPath delYn = createString("delYn");

    public final StringPath fileNm = createString("fileNm");

    public final StringPath fileTyp = createString("fileTyp");

    public final NumberPath<Long> revwCnntsSeq = createNumber("revwCnntsSeq", Long.class);

    public final NumberPath<Long> revwSeq = createNumber("revwSeq", Long.class);

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QRevwCnntsEntity(String variable) {
        super(RevwCnntsEntity.class, forVariable(variable));
    }

    public QRevwCnntsEntity(Path<? extends RevwCnntsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRevwCnntsEntity(PathMetadata metadata) {
        super(RevwCnntsEntity.class, metadata);
    }

}

