package com.bo.main.api.entities.converts;

import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.vo.AdminVo;
import org.mapstruct.*;

@Mapper(
    componentModel = "spring"
)
public interface AdminMapper extends GenericMapper<AdminVo, AdminEntity> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromVo(AdminVo dto, @MappingTarget AdminEntity entity);
}
