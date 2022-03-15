package com.bo.main.api.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "ADMIN")
public class AdminEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 관리자 순번
     */
    @Id
    @Column(name = "ADM_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admSeq;

    /**
     * 관리자 아이디
     */
    @Column(name = "ADM_ID")
    private String admId;

    /**
     * 등록일시
     */
    @Column(name = "CRT_DTM")
    private Date crtDtm;

    /**
     * 등록자
     */
    @Column(name = "CRTR")
    private String crtr;

    /**
     * 수정일시
     */
    @Column(name = "UPD_DTM")
    private Date updDtm;

    /**
     * 수정자
     */
    @Column(name = "UPDTR")
    private String updtr;

    /**
     * 관리자 비번
     */
    @Column(name = "ADM_PWD")
    private String admPwd;

    /**
     * 관리자명
     */
    @Column(name = "ADM_NM")
    private String admNm;

    /**
     * 전화번호
     */
    @Column(name = "ADM_MOBL")
    private String admMobl;

    /**
     * 이메일
     */
    @Column(name = "ADM_MAIL")
    private String admMail;

    /**
     * 사용여부
     */
    @Column(name = "USE_YN")
    private String useYn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AdminEntity that = (AdminEntity) o;
        return admSeq != null && Objects.equals(admSeq, that.admSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
