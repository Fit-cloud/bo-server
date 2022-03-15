package com.bo.main.api.service;

import com.bo.main.api.entities.ClassVideoEntity;
import com.bo.main.api.repositories.ClassVideoEntityRepository;
import com.bo.main.api.entities.vo.ClassVideoEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClassVideoEntityService {

//    @Autowired
//    private ClassVideoEntityRepository classVideoEntityRepository;
//
//    public Long save(ClassVideoEntityVO vO) {
//        ClassVideoEntity bean = new ClassVideoEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = classVideoEntityRepository.save(bean);
//        return bean.getClssSeq();
//    }
//
//    public void delete(Long id) {
//        classVideoEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, ClassVideoEntityUpdateVO vO) {
//        ClassVideoEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        classVideoEntityRepository.save(bean);
//    }
//
//    public ClassVideoEntityDTO getById(Long id) {
//        ClassVideoEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<ClassVideoEntityDTO> query(ClassVideoEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private ClassVideoEntityDTO toDTO(ClassVideoEntity original) {
//        ClassVideoEntityDTO bean = new ClassVideoEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private ClassVideoEntity requireOne(Long id) {
//        return classVideoEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
