package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class MEMBEREntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 회원순번
     */
    @NotNull(message = "mbrSeq can not null")
    private Long mbrSeq;


    /**
     * 회원 아이디
     */
    @NotNull(message = "mbrId can not null")
    private Long mbrId;


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


    /**
     * 회원 명
     */
    @NotNull(message = "mbrNm can not null")
    private String mbrNm;


    /**
     * 비밀번호
     */
    @NotNull(message = "mbrPwd can not null")
    private String mbrPwd;


    /**
     * 전화번화
     */
    @NotNull(message = "MOBL can not null")
    private String MOBL;


    /**
     * 이메일
     */
    @NotNull(message = "MAIL can not null")
    private String MAIL;


    /**
     * 성별
     */
    @NotNull(message = "SEX can not null")
    private String SEX;


    /**
     * 마케팅 수신 동의
     */
    @NotNull(message = "mktYn can not null")
    private String mktYn;


    /**
     * 직업
     */
    private String JOB;


    /**
     * 주소
     */
    private String ADDR;


    /**
     * 회원가입일자
     */
    private String joinDt;


    /**
     * 로그인시간
     */
    private Date lgnDtm;


    /**
     * 휴면여부
     */
    private String slprYn;


    /**
     * 이용정지여부
     */
    private String sspdYn;


    /**
     * 이용정지사유
     */
    private String sspdCd;

}
