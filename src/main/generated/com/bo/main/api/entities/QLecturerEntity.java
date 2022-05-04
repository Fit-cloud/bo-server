package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLecturerEntity is a Querydsl query type for LecturerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLecturerEntity extends EntityPathBase<LecturerEntity> {

    private static final long serialVersionUID = 467631791L;

    public static final QLecturerEntity lecturerEntity = new QLecturerEntity("lecturerEntity");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final StringPath lctrCd = createString("lctrCd");

    public final StringPath lctrImg = createString("lctrImg");

    public final StringPath lctrNm = createString("lctrNm");

    public final NumberPath<Long> lctrSeq = createNumber("lctrSeq", Long.class);

    public final ListPath<LecturerCareerEntity, QLecturerCareerEntity> lecturerCareerEntityList = this.<LecturerCareerEntity, QLecturerCareerEntity>createList("lecturerCareerEntityList", LecturerCareerEntity.class, QLecturerCareerEntity.class, PathInits.DIRECT2);

    public final StringPath mail = createString("mail");

    public final StringPath mobl = createString("mobl");

    public final StringPath SEX = createString("SEX");

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QLecturerEntity(String variable) {
        super(LecturerEntity.class, forVariable(variable));
    }

    public QLecturerEntity(Path<? extends LecturerEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLecturerEntity(PathMetadata metadata) {
        super(LecturerEntity.class, metadata);
    }

}

