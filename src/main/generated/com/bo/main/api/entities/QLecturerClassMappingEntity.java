package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLecturerClassMappingEntity is a Querydsl query type for LecturerClassMappingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLecturerClassMappingEntity extends EntityPathBase<LecturerClassMappingEntity> {

    private static final long serialVersionUID = -1375795067L;

    public static final QLecturerClassMappingEntity lecturerClassMappingEntity = new QLecturerClassMappingEntity("lecturerClassMappingEntity");

    public final NumberPath<Long> clssSeq = createNumber("clssSeq", Long.class);

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final NumberPath<Long> lctrSeq = createNumber("lctrSeq", Long.class);

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QLecturerClassMappingEntity(String variable) {
        super(LecturerClassMappingEntity.class, forVariable(variable));
    }

    public QLecturerClassMappingEntity(Path<? extends LecturerClassMappingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLecturerClassMappingEntity(PathMetadata metadata) {
        super(LecturerClassMappingEntity.class, metadata);
    }

}

