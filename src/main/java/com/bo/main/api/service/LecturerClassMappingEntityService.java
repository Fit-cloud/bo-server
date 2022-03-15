package com.bo.main.api.service;

import com.bo.main.api.entities.LecturerClassMappingEntity;
import com.bo.main.api.repositories.LecturerClassMappingEntityRepository;
import com.bo.main.api.entities.vo.LecturerClassMappingEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LecturerClassMappingEntityService {

//    @Autowired
//    private LecturerClassMappingEntityRepository lecturerClassMappingEntityRepository;
//
//    public Long save(LecturerClassMappingEntityVO vO) {
//        LecturerClassMappingEntity bean = new LecturerClassMappingEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = lecturerClassMappingEntityRepository.save(bean);
//        return bean.getLctrSeq();
//    }
//
//    public void delete(Long id) {
//        lecturerClassMappingEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, LecturerClassMappingEntityUpdateVO vO) {
//        LecturerClassMappingEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        lecturerClassMappingEntityRepository.save(bean);
//    }
//
//    public LecturerClassMappingEntityDTO getById(Long id) {
//        LecturerClassMappingEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<LecturerClassMappingEntityDTO> query(LecturerClassMappingEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private LecturerClassMappingEntityDTO toDTO(LecturerClassMappingEntity original) {
//        LecturerClassMappingEntityDTO bean = new LecturerClassMappingEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private LecturerClassMappingEntity requireOne(Long id) {
//        return lecturerClassMappingEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
