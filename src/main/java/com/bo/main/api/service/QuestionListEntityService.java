package com.bo.main.api.service;

import com.bo.main.api.entities.QuestionListEntity;
import com.bo.main.api.repositories.QuestionListEntityRepository;
import com.bo.main.api.entities.vo.QuestionListEntityVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class QuestionListEntityService {

//    @Autowired
//    private QuestionListEntityRepository questionListEntityRepository;
//
//    public Long save(QuestionListEntityVO vO) {
//        QuestionListEntity bean = new QuestionListEntity();
//        BeanUtils.copyProperties(vO, bean);
//        bean = questionListEntityRepository.save(bean);
//        return bean.getQuesSeq();
//    }
//
//    public void delete(Long id) {
//        questionListEntityRepository.deleteById(id);
//    }
//
//    public void update(Long id, QuestionListEntityUpdateVO vO) {
//        QuestionListEntity bean = requireOne(id);
//        BeanUtils.copyProperties(vO, bean);
//        questionListEntityRepository.save(bean);
//    }
//
//    public QuestionListEntityDTO getById(Long id) {
//        QuestionListEntity original = requireOne(id);
//        return toDTO(original);
//    }
//
//    public Page<QuestionListEntityDTO> query(QuestionListEntityQueryVO vO) {
//        throw new UnsupportedOperationException();
//    }
//
//    private QuestionListEntityDTO toDTO(QuestionListEntity original) {
//        QuestionListEntityDTO bean = new QuestionListEntityDTO();
//        BeanUtils.copyProperties(original, bean);
//        return bean;
//    }
//
//    private QuestionListEntity requireOne(Long id) {
//        return questionListEntityRepository.findById(id)
//                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
//    }
}
