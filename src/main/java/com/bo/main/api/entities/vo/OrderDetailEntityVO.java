package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Data
public class OrderDetailEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 주문번호
     */
    @NotNull(message = "ordrNo can not null")
    private String ordrNo;


    /**
     * 주문구분(주문/취소/반품/교환)
     */
    private String ordrCls;


    /**
     * 주문금액
     */
    private Integer ordrAmt;

}
