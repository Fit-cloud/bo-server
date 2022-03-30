package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "CATEGORY")
public class CategoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 카테고리 ID
     */
    @Id
    @Column(name = "CTGR_ID", nullable = false)
    private Long ctgrId;

    /**
     * 대 카테고리 여부
     */
    @Column(name = "UPPER_CTGR_YN")
    private String upperCtgrYn;

    /**
     * 상위 카테고리 ID
     */
    @Column(name = "UPPER_CTGR_ID")
    private Long upperCtgrId;

    /**
     * 노출여부
     */
    @Column(name = "SHOW_YN")
    private String showYn;

    /**
     * 카테고리 타입
     */
    @Column(name = "CTGR_TYP")
    private String ctgrTyp;

    /**
     * 카테고리명
     */
    @Column(name = "CTGR_NM")
    private String ctgrNm;

    /**
     * 삭제여부
     */
    @Column(name = "DEL_YN")
    private String delYn;

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

}
