package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class MemberDeviceEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 기기순번
     */
    @NotNull(message = "dvSeq can not null")
    private Long dvSeq;


    /**
     * 회원순번
     */
    @NotNull(message = "mbrSeq can not null")
    private Long mbrSeq;


    /**
     * 기기명
     */
    private String dvNm;


    /**
     * OS
     */
    private String OS;


    /**
     * 기기타입
     */
    private String dvTyp;


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
