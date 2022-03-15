package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class ConponIssueHistoryEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 회원 아이디
     */
    @NotNull(message = "mbrId can not null")
    private Long mbrId;


    /**
     * 쿠폰발급번호
     */
    @NotNull(message = "cpnNo can not null")
    private Long cpnNo;


    /**
     * 발급시간
     */
    private Date issueDtm;


    /**
     * 사용시간
     */
    private Date useDtm;


    /**
     * 사용중지시간
     */
    private Date useSppdDtm;


    /**
     * 중지사유
     */
    private String useSppdCd;

}
