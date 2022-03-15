package com.bo.main.api.service;

import com.bo.main.api.entities.ShipListEntity;
import com.bo.main.api.repositories.ShipListEntityRepository;
import com.bo.main.api.entities.vo.ShipListEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ShipListEntityService {

//    @Autowired
//    private ShipListEntityRepository shipListEntityRepository;
//
//    public Long save(ShipListEntityVO vO) {
//        ShipListEntity bean = new ShipListEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = shipListEntityRepository.save(bean);
//        return bean.getShipSeq();
//    }
//
//    public void delete(Long id) {
//        shipListEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, ShipListEntityUpdateVO vO) {
//        ShipListEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        shipListEntityRepository.save(bean);
//    }
//
//    public ShipListEntityDTO getById(Long id) {
//        ShipListEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<ShipListEntityDTO> query(ShipListEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private ShipListEntityDTO toDTO(ShipListEntity original) {
//        ShipListEntityDTO bean = new ShipListEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private ShipListEntity requireOne(Long id) {
//        return shipListEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
