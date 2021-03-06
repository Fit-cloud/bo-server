package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "CLASS_VIDEO")
public class ClassVideoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 강의 순번
     */
    @Id
    @Column(name = "CLSS_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clssSeq;

    /**
     * 영상제목
     */
    @Column(name = "VD_TTL")
    private String vdTtl;

    /**
     * 영상 URL
     */
    @Column(name = "VD_URL")
    private String vdUrl;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    private String delYn;

    /**
     * 미리보기여부
     */
    @Column(name = "PRV_YN")
    private String prvYn;

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
