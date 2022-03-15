package com.bo.main.api.service;

import com.bo.main.api.entities.CategoryEntity;
import com.bo.main.api.repositories.CATEGORYEntityRepository;
import com.bo.main.api.entities.vo.CATEGORYEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CATEGORYEntityService {

//    @Autowired
//    private CATEGORYEntityRepository cATEGORYEntityRepository;
//
//    public Long save(CATEGORYEntityVO vO) {
//        CategoryEntity bean = new CategoryEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = cATEGORYEntityRepository.save(bean);
//        return bean.getCtgrId();
//    }
//
//    public void delete(Long id) {
//        cATEGORYEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, CATEGORYEntityUpdateVO vO) {
//        CategoryEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        cATEGORYEntityRepository.save(bean);
//    }
//
//    public CATEGORYEntityDTO getById(Long id) {
//        CategoryEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<CATEGORYEntityDTO> query(CATEGORYEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private CATEGORYEntityDTO toDTO(CategoryEntity original) {
//        CATEGORYEntityDTO bean = new CATEGORYEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private CategoryEntity requireOne(Long id) {
//        return cATEGORYEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
