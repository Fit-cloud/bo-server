package com.bo.main.api.service;

import com.bo.main.api.entities.MemberEntity;
import com.bo.main.api.repositories.MEMBEREntityRepository;
import com.bo.main.api.entities.vo.MEMBEREntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class MEMBEREntityService {

//    @Autowired
//    private MEMBEREntityRepository mEMBEREntityRepository;
//
//    public Long save(MEMBEREntityVO vO) {
//        MemberEntity bean = new MemberEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = mEMBEREntityRepository.save(bean);
//        return bean.getMbrSeq();
//    }
//
//    public void delete(Long id) {
//        mEMBEREntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, MEMBEREntityUpdateVO vO) {
//        MemberEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        mEMBEREntityRepository.save(bean);
//    }
//
//    public MEMBEREntityDTO getById(Long id) {
//        MemberEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<MEMBEREntityDTO> query(MEMBEREntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private MEMBEREntityDTO toDTO(MemberEntity original) {
//        MEMBEREntityDTO bean = new MEMBEREntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private MemberEntity requireOne(Long id) {
//        return mEMBEREntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
