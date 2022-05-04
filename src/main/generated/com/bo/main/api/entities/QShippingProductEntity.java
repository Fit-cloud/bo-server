package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QShippingProductEntity is a Querydsl query type for ShippingProductEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShippingProductEntity extends EntityPathBase<ShippingProductEntity> {

    private static final long serialVersionUID = -7487316L;

    public static final QShippingProductEntity shippingProductEntity = new QShippingProductEntity("shippingProductEntity");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final NumberPath<Long> ctgrId = createNumber("ctgrId", Long.class);

    public final StringPath prdtCd = createString("prdtCd");

    public final StringPath prdtDesc = createString("prdtDesc");

    public final StringPath prdtImg = createString("prdtImg");

    public final StringPath prdtNm = createString("prdtNm");

    public final NumberPath<Long> shipPrdtSeq = createNumber("shipPrdtSeq", Long.class);

    public final NumberPath<Integer> slsPrc = createNumber("slsPrc", Integer.class);

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QShippingProductEntity(String variable) {
        super(ShippingProductEntity.class, forVariable(variable));
    }

    public QShippingProductEntity(Path<? extends ShippingProductEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShippingProductEntity(PathMetadata metadata) {
        super(ShippingProductEntity.class, metadata);
    }

}

