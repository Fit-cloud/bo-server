package com.bo.main.api.service;

import com.bo.main.api.entities.CouponInfoEntity;
import com.bo.main.api.repositories.CouponInfoEntityRepository;
import com.bo.main.api.entities.vo.CouponInfoEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CouponInfoEntityService {

//    @Autowired
//    private CouponInfoEntityRepository couponInfoEntityRepository;
//
//    public Long save(CouponInfoEntityVO vO) {
//        CouponInfoEntity bean = new CouponInfoEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = couponInfoEntityRepository.save(bean);
//        return bean.getCpnSeq();
//    }
//
//    public void delete(Long id) {
//        couponInfoEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, CouponInfoEntityUpdateVO vO) {
//        CouponInfoEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        couponInfoEntityRepository.save(bean);
//    }
//
//    public CouponInfoEntityDTO getById(Long id) {
//        CouponInfoEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<CouponInfoEntityDTO> query(CouponInfoEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private CouponInfoEntityDTO toDTO(CouponInfoEntity original) {
//        CouponInfoEntityDTO bean = new CouponInfoEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private CouponInfoEntity requireOne(Long id) {
//        return couponInfoEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
