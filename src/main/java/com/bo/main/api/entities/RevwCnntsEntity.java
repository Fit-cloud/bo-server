package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "REVW_CNNTS")
public class RevwCnntsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 리뷰컨텐츠 순번
     */
    @Id
    @Column(name = "REVW_CNNTS_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long revwCnntsSeq;

    /**
     * 리뷰순번
     */
    @Column(name = "REVW_SEQ", nullable = false)
    private Long revwSeq;

    /**
     * 파일명
     */
    @Column(name = "FILE_NM")
    private String fileNm;

    /**
     * 파일타입
     */
    @Column(name = "FILE_TYP")
    private String fileTyp;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    private String delYn;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "crtr")
    private String crtr;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "updtr")
    private String updtr;

}
