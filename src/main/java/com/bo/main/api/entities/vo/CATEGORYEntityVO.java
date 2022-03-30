package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class CATEGORYEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 카테고리 ID
     */
    @NotNull(message = "ctgrId can not null")
    private Long ctgrId;


    /**
     * 대 카테고리 여부
     */
    private String upperCtgrYn;


    /**
     * 상위 카테고리 ID
     */
    private Long upperCtgrId;


    /**
     * 노출여부
     */
    private String showYn;


    /**
     * 카테고리 타입
     */
    private String ctgrTyp;


    /**
     * 카테고리명
     */
    private String ctgrNm;


    /**
     * 삭제여부
     */
    private String delYn;


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
