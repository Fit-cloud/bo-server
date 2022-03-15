package com.bo.main.api.service;

import com.bo.main.api.entities.LecturerCareerEntity;
import com.bo.main.api.repositories.LecturerCareerEntityRepository;
import com.bo.main.api.entities.vo.LecturerCareerEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LecturerCareerEntityService {

//    @Autowired
//    private LecturerCareerEntityRepository lecturerCareerEntityRepository;
//
//    public Long save(LecturerCareerEntityVO vO) {
//        LecturerCareerEntity bean = new LecturerCareerEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = lecturerCareerEntityRepository.save(bean);
//        return bean.getCarrSeq();
//    }
//
//    public void delete(Long id) {
//        lecturerCareerEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, LecturerCareerEntityUpdateVO vO) {
//        LecturerCareerEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        lecturerCareerEntityRepository.save(bean);
//    }
//
//    public LecturerCareerEntityDTO getById(Long id) {
//        LecturerCareerEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<LecturerCareerEntityDTO> query(LecturerCareerEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private LecturerCareerEntityDTO toDTO(LecturerCareerEntity original) {
//        LecturerCareerEntityDTO bean = new LecturerCareerEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private LecturerCareerEntity requireOne(Long id) {
//        return lecturerCareerEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
