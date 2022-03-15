package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "SHIP_LIST")
public class ShipListEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 배송순번
     */
    @Id
    @Column(name = "SHIP_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipSeq;

    /**
     * 주문번호
     */
    @Column(name = "ORDR_NO", nullable = false)
    private Long ordrNo;

    /**
     * 배송타입(배송/반품/교환)
     */
    @Column(name = "SHIP_TYP")
    private String shipTyp;

    /**
     * 우편번호
     */
    @Column(name = "ZIP_CD")
    private String zipCd;

    /**
     * 배송지구분
     */
    @Column(name = "SHIP_CLS")
    private String shipCls;

    /**
     * 배송지주소
     */
    @Column(name = "SHIP_ADDR")
    private String shipAddr;

    /**
     * 배송지주소상세
     */
    @Column(name = "SHIP_ADDR_DTL")
    private String shipAddrDtl;

    /**
     * 배송비
     */
    @Column(name = "SHIP_AMT")
    private Integer shipAmt;

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
