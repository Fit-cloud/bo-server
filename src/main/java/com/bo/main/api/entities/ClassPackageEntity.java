package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "CLASS_PACKAGE")
public class ClassPackageEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 패키지 순번
     */
    @Id
    @Column(name = "PACK_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packSeq;

    /**
     * 패키지 코드
     */
    @Column(name = "PACK_CD")
    private Long packCd;

    /**
     * 카테고리ID
     */
    @Column(name = "CTGR_ID")
    private Long ctgrId;

    /**
     * 패키지 썸네일
     */
    @Column(name = "PACK_THNL")
    private String packThnl;

    /**
     * 강의 패키지 명
     */
    @Column(name = "PACK_NM")
    private String packNm;

    /**
     * 단가
     */
    @Column(name = "PRC")
    private Integer PRC;

    /**
     * 사용여부
     */
    @Column(name = "USE_YN")
    private String useYn;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    private String CRTR;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    private String UPDTR;

}
