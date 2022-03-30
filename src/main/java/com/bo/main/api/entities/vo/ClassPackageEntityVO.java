package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class ClassPackageEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 패키지 순번
     */
    @NotNull(message = "packSeq can not null")
    private Long packSeq;


    /**
     * 패키지 코드
     */
    private Long packCd;


    /**
     * 카테고리ID
     */
    private Long ctgrId;


    /**
     * 패키지 썸네일
     */
    private String packThnl;


    /**
     * 강의 패키지 명
     */
    private String packNm;


    /**
     * 단가
     */
    private Integer PRC;


    /**
     * 사용여부
     */
    private String useYn;


    /**
     * 등록일시
     */
    private Date crtDtm;


    /**
     * 등록자
     */
    private String crtr;


    /**
     * 수정일시
     */
    private Date updDtm;


    /**
     * 수정자
     */
    private String updtr;

}
