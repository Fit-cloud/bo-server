package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class ShipListEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 배송순번
     */
    @NotNull(message = "shipSeq can not null")
    private Long shipSeq;


    /**
     * 주문번호
     */
    @NotNull(message = "ordrNo can not null")
    private Long ordrNo;


    /**
     * 배송타입(배송/반품/교환)
     */
    private String shipTyp;


    /**
     * 우편번호
     */
    private String zipCd;


    /**
     * 배송지구분
     */
    private String shipCls;


    /**
     * 배송지주소
     */
    private String shipAddr;


    /**
     * 배송지주소상세
     */
    private String shipAddrDtl;


    /**
     * 배송비
     */
    private Integer shipAmt;


    /**
     * 등록일시
     */
    private Date crtDtm;


    /**
     * 등록자
     */
    private String CRTR;


    /**
     * 수정일시
     */
    private Date updDtm;


    /**
     * 수정자
     */
    private String UPDTR;

}
