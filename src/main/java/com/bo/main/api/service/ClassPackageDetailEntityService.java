package com.bo.main.api.service;

import com.bo.main.api.entities.ClassPackageDetailEntity;
import com.bo.main.api.repositories.ClassPackageDetailEntityRepository;
import com.bo.main.api.entities.vo.ClassPackageDetailEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClassPackageDetailEntityService {

//    @Autowired
//    private ClassPackageDetailEntityRepository classPackageDetailEntityRepository;
//
//    public Long save(ClassPackageDetailEntityVO vO) {
//        ClassPackageDetailEntity bean = new ClassPackageDetailEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = classPackageDetailEntityRepository.save(bean);
//        return bean.getPackSeq();
//    }
//
//    public void delete(Long id) {
//        classPackageDetailEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, ClassPackageDetailEntityUpdateVO vO) {
//        ClassPackageDetailEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        classPackageDetailEntityRepository.save(bean);
//    }
//
//    public ClassPackageDetailEntityDTO getById(Long id) {
//        ClassPackageDetailEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<ClassPackageDetailEntityDTO> query(ClassPackageDetailEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private ClassPackageDetailEntityDTO toDTO(ClassPackageDetailEntity original) {
//        ClassPackageDetailEntityDTO bean = new ClassPackageDetailEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private ClassPackageDetailEntity requireOne(Long id) {
//        return classPackageDetailEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
