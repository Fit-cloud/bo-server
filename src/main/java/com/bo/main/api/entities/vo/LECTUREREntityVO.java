package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class LECTUREREntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 강사순번
     */
    @NotNull(message = "lctrSeq can not null")
    private Long lctrSeq;


    /**
     * 강사코드
     */
    private Integer lctrCd;


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
     * 강사명
     */
    private String lctrNm;


    /**
     * 전화전호
     */
    private String MOBL;


    /**
     * 이메일
     */
    private String MAIL;


    /**
     * 성별
     */
    private String SEX;


    /**
     * 강사이미지
     */
    private String lctrImg;

}
