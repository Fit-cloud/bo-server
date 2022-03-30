package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "REVW")
public class RevwEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 리뷰순번
     */
    @Id
    @Column(name = "REVW_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long revwSeq;

    /**
     * 판매상품 순번
     */
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    private Long slsPrdtSeq;

    /**
     * 리뷰
     */
    @Column(name = "REVW")
    private String REVW;

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
