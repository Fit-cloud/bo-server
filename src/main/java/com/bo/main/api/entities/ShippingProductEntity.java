package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "SHIPPING_PRODUCT")
public class ShippingProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 배송상품 순번
     */
    @Id
    @Column(name = "SHIP_PRDT_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipPrdtSeq;

    /**
     * 카테고리ID
     */
    @Column(name = "CTGR_ID")
    private Long ctgrId;

    /**
     * 상품코드
     */
    @Column(name = "PRDT_CD")
    private String prdtCd;

    /**
     * 상품명
     */
    @Column(name = "PRDT_NM")
    private String prdtNm;

    /**
     * 상품설명
     */
    @Column(name = "PRDT_DESC")
    private String prdtDesc;

    /**
     * 상품이미지(섬네일)
     */
    @Column(name = "PRDT_IMG")
    private String prdtImg;

    /**
     * 판매단가
     */
    @Column(name = "SLS_PRC")
    private Integer slsPrc;

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
