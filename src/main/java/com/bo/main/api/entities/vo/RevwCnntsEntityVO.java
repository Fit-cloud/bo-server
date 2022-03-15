package com.bo.main.api.entities.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
public class RevwCnntsEntityVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 리뷰컨텐츠 순번
     */
    @NotNull(message = "revwCnntsSeq can not null")
    private Long revwCnntsSeq;


    /**
     * 리뷰순번
     */
    @NotNull(message = "revwSeq can not null")
    private Long revwSeq;


    /**
     * 파일명
     */
    private String fileNm;


    /**
     * 파일타입
     */
    private String fileTyp;


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
