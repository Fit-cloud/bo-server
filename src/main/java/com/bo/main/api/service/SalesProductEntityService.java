package com.bo.main.api.service;

import org.springframework.stereotype.Service;

@Service
public class SalesProductEntityService {

//    @Autowired
//    private SalesProductEntityRepository salesProductEntityRepository;
//
//    public Long save(SalesProductEntityVO vO) {
//        SalesProductEntity bean = new SalesProductEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = salesProductEntityRepository.save(bean);
//        return bean.getSlsPrdtSeq();
//    }
//
//    public void delete(Long id) {
//        salesProductEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, SalesProductEntityUpdateVO vO) {
//        SalesProductEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        salesProductEntityRepository.save(bean);
//    }
//
//    public SalesProductEntityDTO getById(Long id) {
//        SalesProductEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<SalesProductEntityDTO> query(SalesProductEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private SalesProductEntityDTO toDTO(SalesProductEntity original) {
//        SalesProductEntityDTO bean = new SalesProductEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private SalesProductEntity requireOne(Long id) {
//        return salesProductEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
