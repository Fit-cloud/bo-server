package com.bo.main.api.service;

import com.bo.main.api.entities.RevwCnntsEntity;
import com.bo.main.api.repositories.RevwCnntsEntityRepository;
import com.bo.main.api.entities.vo.RevwCnntsEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class RevwCnntsEntityService {

//    @Autowired
//    private RevwCnntsEntityRepository revwCnntsEntityRepository;
//
//    public Long save(RevwCnntsEntityVO vO) {
//        RevwCnntsEntity bean = new RevwCnntsEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = revwCnntsEntityRepository.save(bean);
//        return bean.getRevwCnntsSeq();
//    }
//
//    public void delete(Long id) {
//        revwCnntsEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, RevwCnntsEntityUpdateVO vO) {
//        RevwCnntsEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        revwCnntsEntityRepository.save(bean);
//    }
//
//    public RevwCnntsEntityDTO getById(Long id) {
//        RevwCnntsEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<RevwCnntsEntityDTO> query(RevwCnntsEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private RevwCnntsEntityDTO toDTO(RevwCnntsEntity original) {
//        RevwCnntsEntityDTO bean = new RevwCnntsEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private RevwCnntsEntity requireOne(Long id) {
//        return revwCnntsEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
