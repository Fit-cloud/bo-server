package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QShipListEntity is a Querydsl query type for ShipListEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShipListEntity extends EntityPathBase<ShipListEntity> {

    private static final long serialVersionUID = -1325264779L;

    public static final QShipListEntity shipListEntity = new QShipListEntity("shipListEntity");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final NumberPath<Long> ordrNo = createNumber("ordrNo", Long.class);

    public final StringPath shipAddr = createString("shipAddr");

    public final StringPath shipAddrDtl = createString("shipAddrDtl");

    public final NumberPath<Integer> shipAmt = createNumber("shipAmt", Integer.class);

    public final StringPath shipCls = createString("shipCls");

    public final NumberPath<Long> shipSeq = createNumber("shipSeq", Long.class);

    public final StringPath shipTyp = createString("shipTyp");

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public final StringPath zipCd = createString("zipCd");

    public QShipListEntity(String variable) {
        super(ShipListEntity.class, forVariable(variable));
    }

    public QShipListEntity(Path<? extends ShipListEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShipListEntity(PathMetadata metadata) {
        super(ShipListEntity.class, metadata);
    }

}

