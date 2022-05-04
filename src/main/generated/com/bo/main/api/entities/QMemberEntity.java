package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberEntity is a Querydsl query type for MemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberEntity extends EntityPathBase<MemberEntity> {

    private static final long serialVersionUID = 1667285013L;

    public static final QMemberEntity memberEntity = new QMemberEntity("memberEntity");

    public final StringPath ADDR = createString("ADDR");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final StringPath JOB = createString("JOB");

    public final StringPath joinDt = createString("joinDt");

    public final DateTimePath<java.util.Date> lgnDtm = createDateTime("lgnDtm", java.util.Date.class);

    public final StringPath mail = createString("mail");

    public final NumberPath<Long> mbrId = createNumber("mbrId", Long.class);

    public final StringPath mbrNm = createString("mbrNm");

    public final StringPath mbrPwd = createString("mbrPwd");

    public final NumberPath<Long> mbrSeq = createNumber("mbrSeq", Long.class);

    public final StringPath mktYn = createString("mktYn");

    public final StringPath mobl = createString("mobl");

    public final StringPath SEX = createString("SEX");

    public final StringPath slprYn = createString("slprYn");

    public final StringPath sspdCd = createString("sspdCd");

    public final StringPath sspdYn = createString("sspdYn");

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QMemberEntity(String variable) {
        super(MemberEntity.class, forVariable(variable));
    }

    public QMemberEntity(Path<? extends MemberEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberEntity(PathMetadata metadata) {
        super(MemberEntity.class, metadata);
    }

}

