package com.bo.main.api.service;

import com.bo.main.api.entities.MemberDeviceEntity;
import com.bo.main.api.repositories.MemberDeviceEntityRepository;
import com.bo.main.api.entities.vo.MemberDeviceEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class MemberDeviceEntityService {

//    @Autowired
//    private MemberDeviceEntityRepository memberDeviceEntityRepository;
//
//    public Long save(MemberDeviceEntityVO vO) {
//        MemberDeviceEntity bean = new MemberDeviceEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = memberDeviceEntityRepository.save(bean);
//        return bean.getDvSeq();
//    }
//
//    public void delete(Long id) {
//        memberDeviceEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, MemberDeviceEntityUpdateVO vO) {
//        MemberDeviceEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        memberDeviceEntityRepository.save(bean);
//    }
//
//    public MemberDeviceEntityDTO getById(Long id) {
//        MemberDeviceEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<MemberDeviceEntityDTO> query(MemberDeviceEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private MemberDeviceEntityDTO toDTO(MemberDeviceEntity original) {
//        MemberDeviceEntityDTO bean = new MemberDeviceEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private MemberDeviceEntity requireOne(Long id) {
//        return memberDeviceEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
