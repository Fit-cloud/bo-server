package com.bo.main.api.entities.converts;

import com.bo.main.api.controller.vo.res.ResLecturerVo;
import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.entities.LecturerEntity;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.entities.vo.LecturerVo;
import org.mapstruct.*;

import java.util.List;

@Mapper(
        uses = {
                ClassPackageDetailMapper.class
        },
        componentModel = "spring"
)
public interface ClassPackageMapper extends GenericMapper<ClassPackageVo, ClassPackageEntity> {

    @Mapping(target = "classPackageDetailVoList", source = "classPackageDetailEntities")
    @Override
    ClassPackageVo toVo(ClassPackageEntity classPackageEntity);

    @Mapping(target = "classPackageDetailEntities", source = "classPackageDetailVoList")
    @Override
    ClassPackageEntity toEntity(ClassPackageVo classPackageVo);

    @Override
    List<ClassPackageVo> toVos(List<ClassPackageEntity> e);

    @Override
    List<ClassPackageEntity> toEntities(List<ClassPackageVo> d);
}
