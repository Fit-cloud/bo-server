package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class LecturerCareerEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 경력순번
     */
    @NotNull(message = "carrSeq can not null")
    private Long carrSeq;


    /**
     * 강사순번
     */
    @NotNull(message = "lctrSeq can not null")
    private Long lctrSeq;


    /**
     * 경력 명
     */
    private String carrNm;


    /**
     * 경력번호
     */
    private Integer carrNo;


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
