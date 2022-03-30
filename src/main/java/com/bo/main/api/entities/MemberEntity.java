package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "MEMBER")
public class MemberEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 회원순번
     */
    @Id
    @Column(name = "MBR_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mbrSeq;

    /**
     * 회원 아이디
     */
    @Column(name = "MBR_ID", nullable = false)
    private Long mbrId;

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

    /**
     * 회원 명
     */
    @Column(name = "MBR_NM", nullable = false)
    private String mbrNm;

    /**
     * 비밀번호
     */
    @Column(name = "MBR_PWD", nullable = false)
    private String mbrPwd;

    /**
     * 전화번화
     */
    @Column(name = "mobl", nullable = false)
    private String mobl;

    /**
     * 이메일
     */
    @Column(name = "mail", nullable = false)
    private String mail;

    /**
     * 성별
     */
    @Column(name = "SEX", nullable = false)
    private String SEX;

    /**
     * 마케팅 수신 동의
     */
    @Column(name = "MKT_YN", nullable = false)
    private String mktYn;

    /**
     * 직업
     */
    @Column(name = "JOB")
    private String JOB;

    /**
     * 주소
     */
    @Column(name = "ADDR")
    private String ADDR;

    /**
     * 회원가입일자
     */
    @Column(name = "JOIN_DT")
    private String joinDt;

    /**
     * 로그인시간
     */
    @Column(name = "LGN_DTM")
    private Date lgnDtm;

    /**
     * 휴면여부
     */
    @Column(name = "SLPR_YN")
    private String slprYn;

    /**
     * 이용정지여부
     */
    @Column(name = "SSPD_YN")
    private String sspdYn;

    /**
     * 이용정지사유
     */
    @Column(name = "SSPD_CD")
    private String sspdCd;

}
