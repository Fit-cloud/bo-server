package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrderDetailEntity is a Querydsl query type for OrderDetailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderDetailEntity extends EntityPathBase<OrderDetailEntity> {

    private static final long serialVersionUID = 668506122L;

    public static final QOrderDetailEntity orderDetailEntity = new QOrderDetailEntity("orderDetailEntity");

    public final NumberPath<Integer> ordrAmt = createNumber("ordrAmt", Integer.class);

    public final StringPath ordrCls = createString("ordrCls");

    public final StringPath ordrNo = createString("ordrNo");

    public QOrderDetailEntity(String variable) {
        super(OrderDetailEntity.class, forVariable(variable));
    }

    public QOrderDetailEntity(Path<? extends OrderDetailEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderDetailEntity(PathMetadata metadata) {
        super(OrderDetailEntity.class, metadata);
    }

}

