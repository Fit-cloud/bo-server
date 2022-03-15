package com.bo.main.api.service;

import com.bo.main.api.entities.ConponIssueHistoryEntity;
import com.bo.main.api.repositories.ConponIssueHistoryEntityRepository;
import com.bo.main.api.entities.vo.ConponIssueHistoryEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ConponIssueHistoryEntityService {

//    @Autowired
//    private ConponIssueHistoryEntityRepository conponIssueHistoryEntityRepository;
//
//    public Long save(ConponIssueHistoryEntityVO vO) {
//        ConponIssueHistoryEntity bean = new ConponIssueHistoryEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = conponIssueHistoryEntityRepository.save(bean);
//        return bean.getMbrId();
//    }
//
//    public void delete(Long id) {
//        conponIssueHistoryEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, ConponIssueHistoryEntityUpdateVO vO) {
//        ConponIssueHistoryEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        conponIssueHistoryEntityRepository.save(bean);
//    }
//
//    public ConponIssueHistoryEntityDTO getById(Long id) {
//        ConponIssueHistoryEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<ConponIssueHistoryEntityDTO> query(ConponIssueHistoryEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private ConponIssueHistoryEntityDTO toDTO(ConponIssueHistoryEntity original) {
//        ConponIssueHistoryEntityDTO bean = new ConponIssueHistoryEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private ConponIssueHistoryEntity requireOne(Long id) {
//        return conponIssueHistoryEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
