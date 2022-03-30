package com.bo.main.api.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "SALES_PRODUCT_DETAIL")
public class SalesProductDetailEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 판매상품 순번
     */
    @Id
    @Column(name = "SLS_PRDT_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slsPrdtSeq;

    /**
     * 배송상품 순번
     */
    @Column(name = "SHIP_PRDT_SEQ", nullable = false)
    private Long shipPrdtSeq;

    /**
     * 패키지 순번
     */
    @Column(name = "PACK_SEQ", nullable = false)
    private Long packSeq;

    /**
     * 배송상품여부
     */
    @Column(name = "SHIP_PRDT_YN")
    private String shipPrdtYn;

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
