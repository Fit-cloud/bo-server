package com.bo.main.api.service;

import com.bo.main.api.entities.ClassPackageEntity;
import com.bo.main.api.repositories.ClassPackageEntityRepository;
import com.bo.main.api.entities.vo.ClassPackageEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClassPackageEntityService {

//    @Autowired
//    private ClassPackageEntityRepository classPackageEntityRepository;
//
//    public Long save(ClassPackageEntityVO vO) {
//        ClassPackageEntity bean = new ClassPackageEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = classPackageEntityRepository.save(bean);
//        return bean.getPackSeq();
//    }
//
//    public void delete(Long id) {
//        classPackageEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, ClassPackageEntityUpdateVO vO) {
//        ClassPackageEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        classPackageEntityRepository.save(bean);
//    }
//
//    public ClassPackageEntityDTO getById(Long id) {
//        ClassPackageEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<ClassPackageEntityDTO> query(ClassPackageEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private ClassPackageEntityDTO toDTO(ClassPackageEntity original) {
//        ClassPackageEntityDTO bean = new ClassPackageEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private ClassPackageEntity requireOne(Long id) {
//        return classPackageEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
