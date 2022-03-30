package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class ShippingProductEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 배송상품 순번
     */
    @NotNull(message = "shipPrdtSeq can not null")
    private Long shipPrdtSeq;


    /**
     * 카테고리ID
     */
    private Long ctgrId;


    /**
     * 상품코드
     */
    private String prdtCd;


    /**
     * 상품명
     */
    private String prdtNm;


    /**
     * 상품설명
     */
    private String prdtDesc;


    /**
     * 상품이미지(섬네일)
     */
    private String prdtImg;


    /**
     * 판매단가
     */
    private Integer slsPrc;


    /**
     * 등록일시
     */
    private Date crtDtm;


    /**
     * 등록자
     */
    private String crtr;


    /**
     * 수정일시
     */
    private Date updDtm;


    /**
     * 수정자
     */
    private String updtr;

}
