package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.res.ResLecturerCareerVo;
import com.bo.main.api.entities.LecturerCareerEntity;
import com.bo.main.api.entities.vo.LecturerCareerVo;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-04T10:52:50+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class LecturerCareerMapperImpl implements LecturerCareerMapper {

    @Override
    public List<LecturerCareerVo> toVos(List<LecturerCareerEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<LecturerCareerVo> list = new ArrayList<LecturerCareerVo>( e.size() );
        for ( LecturerCareerEntity lecturerCareerEntity : e ) {
            list.add( toVo( lecturerCareerEntity ) );
        }

        return list;
    }

    @Override
    public List<LecturerCareerEntity> toEntities(List<LecturerCareerVo> d) {
        if ( d == null ) {
            return null;
        }

        List<LecturerCareerEntity> list = new ArrayList<LecturerCareerEntity>( d.size() );
        for ( LecturerCareerVo lecturerCareerVo : d ) {
            list.add( toEntity( lecturerCareerVo ) );
        }

        return list;
    }

    @Override
    public LecturerCareerVo toVo(LecturerCareerEntity lecturerCareerEntity) {
        if ( lecturerCareerEntity == null ) {
            return null;
        }

        LecturerCareerVo lecturerCareerVo = new LecturerCareerVo();

        lecturerCareerVo.setCarrSeq( lecturerCareerEntity.getCarrSeq() );
        lecturerCareerVo.setLctrSeq( lecturerCareerEntity.getLctrSeq() );
        lecturerCareerVo.setCarrNm( lecturerCareerEntity.getCarrNm() );
        lecturerCareerVo.setCarrNo( lecturerCareerEntity.getCarrNo() );
        if ( lecturerCareerEntity.getCrtDtm() != null ) {
            lecturerCareerVo.setCrtDtm( LocalDateTime.ofInstant( lecturerCareerEntity.getCrtDtm().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        lecturerCareerVo.setCrtr( lecturerCareerEntity.getCrtr() );
        if ( lecturerCareerEntity.getUpdDtm() != null ) {
            lecturerCareerVo.setUpdDtm( LocalDateTime.ofInstant( lecturerCareerEntity.getUpdDtm().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        lecturerCareerVo.setUpdtr( lecturerCareerEntity.getUpdtr() );

        return lecturerCareerVo;
    }

    @Override
    public LecturerCareerEntity toEntity(LecturerCareerVo lecturerCareerVo) {
        if ( lecturerCareerVo == null ) {
            return null;
        }

        LecturerCareerEntity lecturerCareerEntity = new LecturerCareerEntity();

        lecturerCareerEntity.setCarrSeq( lecturerCareerVo.getCarrSeq() );
        lecturerCareerEntity.setLctrSeq( lecturerCareerVo.getLctrSeq() );
        lecturerCareerEntity.setCarrNm( lecturerCareerVo.getCarrNm() );
        lecturerCareerEntity.setCarrNo( lecturerCareerVo.getCarrNo() );
        if ( lecturerCareerVo.getCrtDtm() != null ) {
            lecturerCareerEntity.setCrtDtm( Date.from( lecturerCareerVo.getCrtDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        lecturerCareerEntity.setCrtr( lecturerCareerVo.getCrtr() );
        if ( lecturerCareerVo.getUpdDtm() != null ) {
            lecturerCareerEntity.setUpdDtm( Date.from( lecturerCareerVo.getUpdDtm().toInstant( ZoneOffset.UTC ) ) );
        }
        lecturerCareerEntity.setUpdtr( lecturerCareerVo.getUpdtr() );

        return lecturerCareerEntity;
    }

    @Override
    public ResLecturerCareerVo toVo(LecturerCareerVo lecturerCareerVo) {
        if ( lecturerCareerVo == null ) {
            return null;
        }

        ResLecturerCareerVo resLecturerCareerVo = new ResLecturerCareerVo();

        resLecturerCareerVo.setCrtDtm( lecturerCareerVo.getCrtDtm() );
        resLecturerCareerVo.setCrtr( lecturerCareerVo.getCrtr() );
        resLecturerCareerVo.setUpdDtm( lecturerCareerVo.getUpdDtm() );
        resLecturerCareerVo.setUpdtr( lecturerCareerVo.getUpdtr() );
        resLecturerCareerVo.setCarrSeq( lecturerCareerVo.getCarrSeq() );
        resLecturerCareerVo.setCarrNm( lecturerCareerVo.getCarrNm() );
        resLecturerCareerVo.setCarrNo( lecturerCareerVo.getCarrNo() );

        return resLecturerCareerVo;
    }
}
