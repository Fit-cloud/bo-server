package com.bo.main.api.service;

import com.bo.main.api.entities.ShippingProductEntity;
import com.bo.main.api.repositories.ShippingProductEntityRepository;
import com.bo.main.api.entities.vo.ShippingProductEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ShippingProductEntityService {

//    @Autowired
//    private ShippingProductEntityRepository shippingProductEntityRepository;
//
//    public Long save(ShippingProductEntityVO vO) {
//        ShippingProductEntity bean = new ShippingProductEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = shippingProductEntityRepository.save(bean);
//        return bean.getShipPrdtSeq();
//    }
//
//    public void delete(Long id) {
//        shippingProductEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, ShippingProductEntityUpdateVO vO) {
//        ShippingProductEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        shippingProductEntityRepository.save(bean);
//    }
//
//    public ShippingProductEntityDTO getById(Long id) {
//        ShippingProductEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<ShippingProductEntityDTO> query(ShippingProductEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private ShippingProductEntityDTO toDTO(ShippingProductEntity original) {
//        ShippingProductEntityDTO bean = new ShippingProductEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private ShippingProductEntity requireOne(Long id) {
//        return shippingProductEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
