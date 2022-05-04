package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSalesProductEntity is a Querydsl query type for SalesProductEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSalesProductEntity extends EntityPathBase<SalesProductEntity> {

    private static final long serialVersionUID = -1149333762L;

    public static final QSalesProductEntity salesProductEntity = new QSalesProductEntity("salesProductEntity");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final NumberPath<Long> ctgrId = createNumber("ctgrId", Long.class);

    public final StringPath delYn = createString("delYn");

    public final StringPath prdtDesc = createString("prdtDesc");

    public final StringPath prdtNm = createString("prdtNm");

    public final StringPath prdtRepImg = createString("prdtRepImg");

    public final StringPath shipCls = createString("shipCls");

    public final NumberPath<Integer> shipFee = createNumber("shipFee", Integer.class);

    public final NumberPath<Integer> slsCost = createNumber("slsCost", Integer.class);

    public final NumberPath<Integer> slsPrc = createNumber("slsPrc", Integer.class);

    public final NumberPath<Long> slsPrdtSeq = createNumber("slsPrdtSeq", Long.class);

    public final StringPath slsStat = createString("slsStat");

    public final NumberPath<Integer> STOCK = createNumber("STOCK", Integer.class);

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QSalesProductEntity(String variable) {
        super(SalesProductEntity.class, forVariable(variable));
    }

    public QSalesProductEntity(Path<? extends SalesProductEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalesProductEntity(PathMetadata metadata) {
        super(SalesProductEntity.class, metadata);
    }

}

