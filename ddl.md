## ADMIN
    -- auto-generated definition
    create table ADMIN
    (
        ADM_SEQ  bigint auto_increment comment '관리자 순번'
        primary key,
        ADM_ID   varchar(50)  null comment '관리자 아이디',
        CRT_DTM  datetime     null comment '등록일시',
        CRTR     varchar(255) null comment '등록자',
        UPD_DTM  datetime     null comment '수정일시',
        UPDTR    varchar(255) null comment '수정자',
        ADM_PWD  varchar(500) null comment '관리자 비번',
        ADM_NM   varchar(100) null comment '관리자명',
        ADM_MOBL varchar(11)  null comment '전화번호',
        ADM_MAIL varchar(100) null comment '이메일',
        USE_YN   char         null comment '사용여부',
        constraint ADMIN_ADM_ID_uindex
        unique (ADM_ID)
    );


