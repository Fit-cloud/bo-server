package com.bo.main.api.service;

import com.bo.main.api.entities.OrderInfoEntity;
import com.bo.main.api.repositories.OrderInfoEntityRepository;
import com.bo.main.api.entities.vo.OrderInfoEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class OrderInfoEntityService {

//    @Autowired
//    private OrderInfoEntityRepository orderInfoEntityRepository;
//
//    public Long save(OrderInfoEntityVO vO) {
//        OrderInfoEntity bean = new OrderInfoEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = orderInfoEntityRepository.save(bean);
//        return bean.getCartNo();
//    }
//
//    public void delete(Long id) {
//        orderInfoEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, OrderInfoEntityUpdateVO vO) {
//        OrderInfoEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        orderInfoEntityRepository.save(bean);
//    }
//
//    public OrderInfoEntityDTO getById(Long id) {
//        OrderInfoEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<OrderInfoEntityDTO> query(OrderInfoEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private OrderInfoEntityDTO toDTO(OrderInfoEntity original) {
//        OrderInfoEntityDTO bean = new OrderInfoEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private OrderInfoEntity requireOne(Long id) {
//        return orderInfoEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
