package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "LECTURER_CAREER")
public class LecturerCareerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 경력순번
     */
    @Id
    @Column(name = "CARR_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carrSeq;

    /**
     * 강사순번
     */
    @Column(name = "LCTR_SEQ", nullable = false)
    private Long lctrSeq;

    /**
     * 경력 명
     */
    @Column(name = "CARR_NM")
    private String carrNm;

    /**
     * 경력번호
     */
    @Column(name = "CARR_NO")
    private Integer carrNo;

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
