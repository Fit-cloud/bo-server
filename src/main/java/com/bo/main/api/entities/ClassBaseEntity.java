package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "CLASS_BASE")
public class ClassBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 강의 순번
     */
    @Id
    @Column(name = "CLSS_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clssSeq;

    /**
     * 강의코드
     */
    @Column(name = "CLSS_CD", nullable = false)
    private Long clssCd;

    /**
     * 강의명
     */
    @Column(name = "CLSS_NM")
    private String clssNm;

    /**
     * 강의설명
     */
    @Column(name = "CLSS_DESC")
    private String clssDesc;

    /**
     * 미리보기영상여부
     */
    @Column(name = "PRV_YN")
    private String prvYn;

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
