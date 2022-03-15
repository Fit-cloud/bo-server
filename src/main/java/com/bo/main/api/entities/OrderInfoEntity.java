package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ORDER_INFO")
public class OrderInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 장바구니 번호
     */
    @Id
    @Column(name = "CART_NO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartNo;

    /**
     * 주문번호
     */
    @Column(name = "ORDR_NO", nullable = false)
    private String ordrNo;

    /**
     * 주문금액
     */
    @Column(name = "ORDR_AMT")
    private Integer ordrAmt;

    /**
     * 쿠폰할인가
     */
    @Column(name = "CPN_DSCT_AMT")
    private Integer cpnDsctAmt;

    /**
     * 주문상태
     */
    @Column(name = "ORDR_STAT")
    private String ordrStat;

    /**
     * 결제일자
     */
    @Column(name = "PYMT_DT")
    private String pymtDt;

    /**
     * 취소일자
     */
    @Column(name = "CNCL_DT")
    private String cnclDt;

    /**
     * 반품일자
     */
    @Column(name = "RTRN_DT")
    private String rtrnDt;

    /**
     * 취소상세내역
     */
    @Column(name = "CNCL_DTL_LIST")
    private String cnclDtlList;

}
