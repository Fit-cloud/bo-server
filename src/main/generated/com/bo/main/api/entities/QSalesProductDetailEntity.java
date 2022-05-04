package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSalesProductDetailEntity is a Querydsl query type for SalesProductDetailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSalesProductDetailEntity extends EntityPathBase<SalesProductDetailEntity> {

    private static final long serialVersionUID = 1175474799L;

    public static final QSalesProductDetailEntity salesProductDetailEntity = new QSalesProductDetailEntity("salesProductDetailEntity");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final NumberPath<Long> packSeq = createNumber("packSeq", Long.class);

    public final NumberPath<Long> shipPrdtSeq = createNumber("shipPrdtSeq", Long.class);

    public final StringPath shipPrdtYn = createString("shipPrdtYn");

    public final NumberPath<Long> slsPrdtSeq = createNumber("slsPrdtSeq", Long.class);

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QSalesProductDetailEntity(String variable) {
        super(SalesProductDetailEntity.class, forVariable(variable));
    }

    public QSalesProductDetailEntity(Path<? extends SalesProductDetailEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalesProductDetailEntity(PathMetadata metadata) {
        super(SalesProductDetailEntity.class, metadata);
    }

}

