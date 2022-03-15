package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "CLASS_PACKAGE_DETAIL")
public class ClassPackageDetailEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 패키지 순번
     */
    @Id
    @Column(name = "PACK_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packSeq;

    /**
     * 강의 순번
     */
    @Column(name = "CLSS_SEQ", nullable = false)
    private Long clssSeq;

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
