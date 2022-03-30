package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "MEMBER_DEVICE")
public class MemberDeviceEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 기기순번
     */
    @Id
    @Column(name = "DV_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dvSeq;

    /**
     * 회원순번
     */
    @Column(name = "MBR_SEQ", nullable = false)
    private Long mbrSeq;

    /**
     * 기기명
     */
    @Column(name = "DV_NM")
    private String dvNm;

    /**
     * OS
     */
    @Column(name = "OS")
    private String OS;

    /**
     * 기기타입
     */
    @Column(name = "DV_TYP")
    private String dvTyp;

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
