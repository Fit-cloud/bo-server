package com.bo.main.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "QUESTION_LIST")
public class QuestionListEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 문의내역 순번
     */
    @Id
    @Column(name = "QUES_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quesSeq;

    /**
     * 회원순번
     */
    @Column(name = "MBR_SEQ", nullable = false)
    private Long mbrSeq;

    /**
     * 문의내역 제목
     */
    @Column(name = "QUES_TTL")
    private String quesTtl;

    /**
     * 문의내역 내용
     */
    @Column(name = "QUES_CNNTS")
    private String quesCnnts;

    /**
     * 답변여부
     */
    @Column(name = "ANS_YN")
    private String ansYn;

    /**
     * 답변 내용
     */
    @Column(name = "ANS_CNNTS")
    private String ansCnnts;

    /**
     * 답변완료일자
     */
    @Column(name = "ANS_CMPLT_DT")
    private String ansCmpltDt;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    private String CRTR;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    private String UPDTR;

}
