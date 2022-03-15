package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class ClassPackageDetailEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 패키지 순번
     */
    @NotNull(message = "packSeq can not null")
    private Long packSeq;


    /**
     * 강의 순번
     */
    @NotNull(message = "clssSeq can not null")
    private Long clssSeq;


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
