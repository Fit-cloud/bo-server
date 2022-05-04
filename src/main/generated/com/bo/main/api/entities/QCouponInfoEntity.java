package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCouponInfoEntity is a Querydsl query type for CouponInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCouponInfoEntity extends EntityPathBase<CouponInfoEntity> {

    private static final long serialVersionUID = 471907311L;

    public static final QCouponInfoEntity couponInfoEntity = new QCouponInfoEntity("couponInfoEntity");

    public final StringPath cpnNm = createString("cpnNm");

    public final NumberPath<Long> cpnNo = createNumber("cpnNo", Long.class);

    public final NumberPath<Long> cpnSeq = createNumber("cpnSeq", Long.class);

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final NumberPath<Integer> dsctAmt = createNumber("dsctAmt", Integer.class);

    public final NumberPath<Double> dsctRatio = createNumber("dsctRatio", Double.class);

    public final DateTimePath<java.util.Date> issueEdDtm = createDateTime("issueEdDtm", java.util.Date.class);

    public final NumberPath<Integer> issueQty = createNumber("issueQty", Integer.class);

    public final StringPath issueSppdYn = createString("issueSppdYn");

    public final DateTimePath<java.util.Date> issueStDtm = createDateTime("issueStDtm", java.util.Date.class);

    public final StringPath issueTyp = createString("issueTyp");

    public final StringPath issueUseDt = createString("issueUseDt");

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QCouponInfoEntity(String variable) {
        super(CouponInfoEntity.class, forVariable(variable));
    }

    public QCouponInfoEntity(Path<? extends CouponInfoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCouponInfoEntity(PathMetadata metadata) {
        super(CouponInfoEntity.class, metadata);
    }

}

