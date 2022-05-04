package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderInfoEntity is a Querydsl query type for OrderInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderInfoEntity extends EntityPathBase<OrderInfoEntity> {

    private static final long serialVersionUID = 1105727527L;

    public static final QOrderInfoEntity orderInfoEntity = new QOrderInfoEntity("orderInfoEntity");

    public final NumberPath<Long> cartNo = createNumber("cartNo", Long.class);

    public final StringPath cnclDt = createString("cnclDt");

    public final StringPath cnclDtlList = createString("cnclDtlList");

    public final NumberPath<Integer> cpnDsctAmt = createNumber("cpnDsctAmt", Integer.class);

    public final NumberPath<Integer> ordrAmt = createNumber("ordrAmt", Integer.class);

    public final StringPath ordrNo = createString("ordrNo");

    public final StringPath ordrStat = createString("ordrStat");

    public final StringPath pymtDt = createString("pymtDt");

    public final StringPath rtrnDt = createString("rtrnDt");

    public QOrderInfoEntity(String variable) {
        super(OrderInfoEntity.class, forVariable(variable));
    }

    public QOrderInfoEntity(Path<? extends OrderInfoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderInfoEntity(PathMetadata metadata) {
        super(OrderInfoEntity.class, metadata);
    }

}

