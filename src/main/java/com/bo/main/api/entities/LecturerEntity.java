package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "LECTURER")
public class LecturerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 강사순번
     */
    @Id
    @Column(name = "LCTR_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lctrSeq;

    /**
     * 강사코드
     */
    @Column(name = "LCTR_CD")
    private Integer lctrCd;

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

    /**
     * 강사명
     */
    @Column(name = "LCTR_NM")
    private String lctrNm;

    /**
     * 전화전호
     */
    @Column(name = "MOBL")
    private String MOBL;

    /**
     * 이메일
     */
    @Column(name = "MAIL")
    private String MAIL;

    /**
     * 성별
     */
    @Column(name = "SEX")
    private String SEX;

    /**
     * 강사이미지
     */
    @Column(name = "LCTR_IMG")
    private String lctrImg;

}
