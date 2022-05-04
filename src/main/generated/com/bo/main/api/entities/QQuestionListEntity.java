package com.bo.main.api.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QQuestionListEntity is a Querydsl query type for QuestionListEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQuestionListEntity extends EntityPathBase<QuestionListEntity> {

    private static final long serialVersionUID = 1666034079L;

    public static final QQuestionListEntity questionListEntity = new QQuestionListEntity("questionListEntity");

    public final StringPath ansCmpltDt = createString("ansCmpltDt");

    public final StringPath ansCnnts = createString("ansCnnts");

    public final StringPath ansYn = createString("ansYn");

    public final DateTimePath<java.util.Date> crtDtm = createDateTime("crtDtm", java.util.Date.class);

    public final StringPath crtr = createString("crtr");

    public final NumberPath<Long> mbrSeq = createNumber("mbrSeq", Long.class);

    public final StringPath quesCnnts = createString("quesCnnts");

    public final NumberPath<Long> quesSeq = createNumber("quesSeq", Long.class);

    public final StringPath quesTtl = createString("quesTtl");

    public final DateTimePath<java.util.Date> updDtm = createDateTime("updDtm", java.util.Date.class);

    public final StringPath updtr = createString("updtr");

    public QQuestionListEntity(String variable) {
        super(QuestionListEntity.class, forVariable(variable));
    }

    public QQuestionListEntity(Path<? extends QuestionListEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQuestionListEntity(PathMetadata metadata) {
        super(QuestionListEntity.class, metadata);
    }

}

