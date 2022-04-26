package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.req.ReqAdminVo;
import com.bo.main.api.controller.vo.req.ReqClassBaseVo;
import com.bo.main.api.controller.vo.res.ResAdminVo;
import com.bo.main.api.controller.vo.res.ResClassBaseVo;
import com.bo.main.api.controller.vo.res.ResLecturerVo;
import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.entities.LecturerEntity;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.LecturerVo;
import org.mapstruct.*;

import java.util.List;

@Mapper(
        uses = {
                ClassVideoMapper.class
        },
        componentModel = "spring"
)
public interface ClassBaseMapper extends GenericMapper<ClassBaseVo, ClassBaseEntity> {

    @Mapping(target = "videos", ignore = true)
    @Override
    ClassBaseVo toVo(ClassBaseEntity classBaseEntity);

    @Override
    ClassBaseEntity toEntity(ClassBaseVo classBaseVo);

    @Override
    List<ClassBaseVo> toVos(List<ClassBaseEntity> e);

    @Override
    List<ClassBaseEntity> toEntities(List<ClassBaseVo> d);


    ClassBaseVo toVo(ReqClassBaseVo reqClassBaseVo);

    ResClassBaseVo toVo(ClassBaseVo classBaseVo);

    void updateFromVo(ClassBaseVo dto, @MappingTarget ClassBaseEntity entity);

}
