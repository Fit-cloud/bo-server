package com.bo.main.api.entities.vo;

import com.bo.main.api.entities.BaseTimeEntity;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Data
public class ClassPackageDetailVo  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 패키지 순번
     */
    private Long packSeq;

    /**
     * 강의 순번
     */
    private Long clssSeq;

    private ClassBaseVo classBaseVo;

    private ClassPackageVo classPackageVo;

    /**
     * 등록일시
     */

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime crtDtm;

    /**
     * 등록자
     */
    private String crtr;

    /**
     * 수정일시
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime updDtm;

    /**
     * 수정자
     */
    private String updtr;

}
