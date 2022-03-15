package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "SALES PRODUCT")
public class SalesProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 판매상품 순번
     */
    @Id
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slsPrdtSeq;

    /**
     * 카테고리
     */
    @Column(name = "CTGR_ID")
    private Long ctgrId;

    /**
     * 상품명
     */
    @Column(name = "PRDT_NM")
    private String prdtNm;

    /**
     * 배송구분
     */
    @Column(name = "SHIP_CLS")
    private String shipCls;

    /**
     * 판매원가
     */
    @Column(name = "SLS_COST")
    private Integer slsCost;

    /**
     * 판매가
     */
    @Column(name = "SLS_PRC")
    private Integer slsPrc;

    /**
     * 배송비
     */
    @Column(name = "SHIP_FEE")
    private Integer shipFee;

    /**
     * 재고
     */
    @Column(name = "STOCK")
    private Integer STOCK;

    /**
     * 판매상태(SALE, STOP, SOLD OUT, END)
     */
    @Column(name = "SLS_STAT")
    private String slsStat;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    private String delYn;

    /**
     * 상품대표이미지
     */
    @Column(name = "PRDT_REP_IMG")
    private String prdtRepImg;

    /**
     * 상품 설명
     */
    @Column(name = "PRDT_DESC")
    private String prdtDesc;

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
