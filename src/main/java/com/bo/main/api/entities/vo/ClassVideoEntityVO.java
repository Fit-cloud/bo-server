package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class ClassVideoEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 강의 순번
     */
    @NotNull(message = "clssSeq can not null")
    private Long clssSeq;


    /**
     * 영상제목
     */
    private String vdTtl;


    /**
     * 영상 URL
     */
    private String vdUrl;


    /**
     * 삭제여부
     */
    private String delYn;


    /**
     * 미리보기여부
     */
    private String prvYn;


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
