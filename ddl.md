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

##  LECTURER
    -- auto-generated definition
    create table LECTURER
    (
        LCTR_SEQ bigint auto_increment comment '강사순번'
        primary key,
        LCTR_CD  varchar(50)  null comment '강사코드',
        LCTR_NM  varchar(100) null comment '강사명',
        MOBL     varchar(11)  null comment '전화전호',
        MAIL     varchar(100) null comment '이메일',
        SEX      char         null comment '성별',
        LCTR_IMG varchar(500) null comment '강사이미지',
        CRT_DTM  datetime     null comment '등록일시',
        CRTR     varchar(255) null comment '등록자',
        UPD_DTM  datetime     null comment '수정일시',
        UPDTR    varchar(255) null comment '수정자'
    );

##  LECTURER_CAREER
    -- auto-generated definition
    create table LECTURER_CAREER
    (
    CARR_SEQ bigint auto_increment comment '강사경력순번(시컨스)'
    primary key,
    LCTR_SEQ bigint       not null comment '강사순번',
    CARR_NO  int          null comment '경력번호',
    CARR_NM  varchar(100) null comment '경력 명',
    CRT_DTM  datetime     null comment '등록일시',
    CRTR     varchar(255) null comment '등록자',
    UPD_DTM  datetime     null comment '수정일시',
    UPDTR    varchar(255) null comment '수정자'
    );



##  CLASS_BASE
    -- auto-generated definition
    create table CLASS_BASE
    (
    CLSS_SEQ  bigint auto_increment comment '강의 순번'
    primary key,
    CLSS_CD   varchar(50)   not null comment '강의코드',
    CLSS_NM   varchar(100)  null comment '강의명',
    CLSS_DESC varchar(2000) null comment '강의설명',
    PRV_YN    char          null comment '미리보기영상여부',
    USE_YN    char          null comment '사용여부',
    CRT_DTM   datetime      null comment '등록일시',
    CRTR      varchar(255)  null comment '등록자',
    UPD_DTM   datetime      null comment '수정일시',
    UPDTR     varchar(255)  null comment '수정자'
    );

##  CLASS_VIDEO

    -- auto-generated definition
    create table CLASS_VIDEO
    (
    VD_SEQ   bigint auto_increment comment '비디오 순번'
    primary key,
    CLSS_SEQ bigint       not null comment '강의 순번',
    VD_TTL   varchar(100) null comment '영상제목',
    VD_URL   varchar(500) null comment '영상 URL',
    DEL_YN   char         null comment '삭제여부',
    PRV_YN   char         null comment '미리보기여부',
    CRT_DTM  datetime     null comment '등록일시',
    CRTR     varchar(255) null comment '등록자',
    UPD_DTM  datetime     null comment '수정일시',
    UPDTR    varchar(255) null comment '수정자'
    );

##LECTURER_CLASS_MAPPING
    -- auto-generated definition
    create table LECTURER_CLASS_MAPPING
    (
    LCTR_SEQ bigint auto_increment comment '강사순번'
    primary key,
    CLSS_SEQ bigint       not null comment '강의 순번',
    CRT_DTM  datetime     null comment '등록일시',
    CRTR     varchar(255) null comment '등록자',
    UPD_DTM  datetime     null comment '수정일시',
    UPDTR    varchar(255) null comment '수정자'
    );



## CLASS_PACKAGE
    -- auto-generated definition
    create table CLASS_PACKAGE
    (
    PACK_SEQ  bigint auto_increment comment '패키지 순번'
    primary key,
    PACK_CD   varchar(50)  null comment '패키지 코드',
    CTGR_ID   bigint       null comment '카테고리ID',
    PACK_THNL varchar(500) null comment '패키지 썸네일',
    PACK_NM   varchar(100) null comment '강의 패키지 명',
    PRC       int          null comment '단가',
    USE_YN    char         null comment '사용여부',
    CRT_DTM   datetime     null comment '등록일시',
    CRTR      varchar(255) null comment '등록자',
    UPD_DTM   datetime     null comment '수정일시',
    UPDTR     varchar(255) null comment '수정자'
    );

## CLASS_PACKAGE_DETAIL
    -- auto-generated definition
    create table CLASS_PACKAGE_DETAIL
    (
    PACK_SEQ bigint auto_increment comment '패키지 순번'
    primary key,
    CLSS_SEQ bigint       not null comment '강의 순번',
    CRT_DTM  datetime     null comment '등록일시',
    CRTR     varchar(255) null comment '등록자',
    UPD_DTM  datetime     null comment '수정일시',
    UPDTR    varchar(255) null comment '수정자'
    );


