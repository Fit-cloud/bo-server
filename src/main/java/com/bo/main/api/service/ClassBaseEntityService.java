package com.bo.main.api.service;

import com.bo.main.api.entities.ClassBaseEntity;
import com.bo.main.api.repositories.ClassBaseEntityRepository;
import com.bo.main.api.entities.vo.ClassBaseEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClassBaseEntityService {

//    @Autowired
//    private ClassBaseEntityRepository classBaseEntityRepository;
//
//    public Long save(ClassBaseEntityVO vO) {
//        ClassBaseEntity bean = new ClassBaseEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = classBaseEntityRepository.save(bean);
//        return bean.getClssSeq();
//    }
//
//    public void delete(Long id) {
//        classBaseEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, ClassBaseEntityUpdateVO vO) {
//        ClassBaseEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        classBaseEntityRepository.save(bean);
//    }
//
//    public ClassBaseEntityDTO getById(Long id) {
//        ClassBaseEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<ClassBaseEntityDTO> query(ClassBaseEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private ClassBaseEntityDTO toDTO(ClassBaseEntity original) {
//        ClassBaseEntityDTO bean = new ClassBaseEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private ClassBaseEntity requireOne(Long id) {
//        return classBaseEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
