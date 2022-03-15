package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ORDER_DETAIL")
public class OrderDetailEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 주문번호
     */
    @Id
    @Column(name = "ORDR_NO", nullable = false)
    private String ordrNo;

    /**
     * 주문구분(주문/취소/반품/교환)
     */
    @Column(name = "ORDR_CLS")
    private String ordrCls;

    /**
     * 주문금액
     */
    @Column(name = "ORDR_AMT")
    private Integer ordrAmt;

}
