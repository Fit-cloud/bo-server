package com.bo.main.api.service;

import com.bo.main.api.entities.LecturerEntity;
import com.bo.main.api.repositories.LECTUREREntityRepository;
import com.bo.main.api.entities.vo.LECTUREREntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LECTUREREntityService {

//    @Autowired
//    private LECTUREREntityRepository lECTUREREntityRepository;
//
//    public Long save(LECTUREREntityVO vO) {
//        LecturerEntity bean = new LecturerEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = lECTUREREntityRepository.save(bean);
//        return bean.getLctrSeq();
//    }
//
//    public void delete(Long id) {
//        lECTUREREntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, LECTUREREntityUpdateVO vO) {
//        LecturerEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        lECTUREREntityRepository.save(bean);
//    }
//
//    public LECTUREREntityDTO getById(Long id) {
//        LecturerEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<LECTUREREntityDTO> query(LECTUREREntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private LECTUREREntityDTO toDTO(LecturerEntity original) {
//        LECTUREREntityDTO bean = new LECTUREREntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private LecturerEntity requireOne(Long id) {
//        return lECTUREREntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
