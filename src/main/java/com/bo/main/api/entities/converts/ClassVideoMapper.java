package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqClassBaseVo;
import com.bo.main.api.controller.vo.req.ReqClassVideoVo;
import com.bo.main.api.controller.vo.res.ResClassBaseVo;
import com.bo.main.api.controller.vo.res.ResClassVideoVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface ClassVideoMapper extends GenericMapper<ClassVideoVo, ClassVideoEntity> {

    @Override
    ClassVideoVo toVo(ClassVideoEntity classBaseEntity);

    @Override
    ClassVideoEntity toEntity(ClassVideoVo classBaseVo);

    @Override
    List<ClassVideoVo> toVos(List<ClassVideoEntity> e);

    @Override
    List<ClassVideoEntity> toEntities(List<ClassVideoVo> d);


    ClassVideoVo toVo(ReqClassVideoVo reqClassBaseVo);

    ResClassVideoVo toVo(ClassVideoVo classBaseVo);

    void updateFromVo(ClassVideoVo dto, @MappingTarget ClassVideoEntity entity);

}
