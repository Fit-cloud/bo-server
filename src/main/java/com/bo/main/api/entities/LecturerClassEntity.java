package com.bo.main.api.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "LECTURER_CLASS_MAPPING")
public class LecturerClassEntity extends BaseTimeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 강사순번
     */
    @Id
    @Column(name = "LCTR_SEQ", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lctrSeq;

    /**
     * 강의 순번
     */
    @Column(name = "CLSS_SEQ", nullable = false)
    private Long clssSeq;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LecturerClassEntity that = (LecturerClassEntity) o;
        return lctrSeq != null && Objects.equals(lctrSeq, that.lctrSeq);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
