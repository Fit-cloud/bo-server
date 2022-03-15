package com.bo.main.api.service;

import com.bo.main.api.entities.OrderDetailEntity;
import com.bo.main.api.repositories.OrderDetailEntityRepository;
import com.bo.main.api.entities.vo.OrderDetailEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class OrderDetailEntityService {

//    @Autowired
//    private OrderDetailEntityRepository orderDetailEntityRepository;
//
//    public String save(OrderDetailEntityVO vO) {
//        OrderDetailEntity bean = new OrderDetailEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = orderDetailEntityRepository.save(bean);
//        return bean.getOrdrNo();
//    }
//
//    public void delete(String id) {
//        orderDetailEntityRepository.deleteById(id);
//    }
//
//    public void update(String id, OrderDetailEntityUpdateVO vO) {
//        OrderDetailEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        orderDetailEntityRepository.save(bean);
//    }
//
//    public OrderDetailEntityDTO getById(String id) {
//        OrderDetailEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<OrderDetailEntityDTO> query(OrderDetailEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private OrderDetailEntityDTO toDTO(OrderDetailEntity original) {
//        OrderDetailEntityDTO bean = new OrderDetailEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private OrderDetailEntity requireOne(String id) {
//        return orderDetailEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
