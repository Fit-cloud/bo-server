package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberDeviceEntity is a Querydsl query type for MemberDeviceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberDeviceEntity extends EntityPathBase<MemberDeviceEntity> {

    private static final long serialVersionUID = 2006762635L;

    public static final QMemberDeviceEntity memberDeviceEntity = new QMemberDeviceEntity("memberDeviceEntity");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final StringPath delYn = createString("delYn");

    public final StringPath dvNm = createString("dvNm");

    public final NumberPath<Long> dvSeq = createNumber("dvSeq", Long.class);

    public final StringPath dvTyp = createString("dvTyp");

    public final NumberPath<Long> mbrSeq = createNumber("mbrSeq", Long.class);

    public final StringPath OS = createString("OS");

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QMemberDeviceEntity(String variable) {
        super(MemberDeviceEntity.class, forVariable(variable));
    }

    public QMemberDeviceEntity(Path<? extends MemberDeviceEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberDeviceEntity(PathMetadata metadata) {
        super(MemberDeviceEntity.class, metadata);
    }

}

