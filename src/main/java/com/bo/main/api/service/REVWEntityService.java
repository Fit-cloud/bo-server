package com.bo.main.api.service;

import com.bo.main.api.entities.RevwEntity;
import com.bo.main.api.repositories.REVWEntityRepository;
import com.bo.main.api.entities.vo.REVWEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class REVWEntityService {

//    @Autowired
//    private REVWEntityRepository rEVWEntityRepository;
//
//    public Long save(REVWEntityVO vO) {
//        RevwEntity bean = new RevwEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = rEVWEntityRepository.save(bean);
//        return bean.getRevwSeq();
//    }
//
//    public void delete(Long id) {
//        rEVWEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, REVWEntityUpdateVO vO) {
//        RevwEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        rEVWEntityRepository.save(bean);
//    }
//
//    public REVWEntityDTO getById(Long id) {
//        RevwEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<REVWEntityDTO> query(REVWEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private REVWEntityDTO toDTO(RevwEntity original) {
//        REVWEntityDTO bean = new REVWEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private RevwEntity requireOne(Long id) {
//        return rEVWEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
