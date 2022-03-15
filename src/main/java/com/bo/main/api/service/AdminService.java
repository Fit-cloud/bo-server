package com.bo.main.api.service;

import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.converts.AdminMapper;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.repositories.jpa.AdminRepository;
import com.bo.main.api.repositories.querydsl.QAdminRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class AdminService {

    private final QAdminRepository qAdminRepository;
    private final AdminRepository adminRepository;

    private final AdminMapper adminMapper;

    public Optional<AdminEntity> findAdminByIdRetOpt(String adminId) {
        return adminRepository.findByAdmId(adminId);
    }

    public AdminVo findAdminByIdRetNew(String adminId){
        Optional<AdminEntity> opt = findAdminByIdRetOpt(adminId);
        return adminMapper.toVo(opt.orElseGet(AdminEntity::new));
    }

    public AdminVo findAdminByIdRetError(String adminId) throws Exception{
        Optional<AdminEntity> opt = findAdminByIdRetOpt(adminId);
        return adminMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Admin 정보({})가 없습니다.", adminId))));
    }

    public AdminVo save(AdminVo adminVo) throws Exception {

        Optional<AdminEntity> loadAdmin = findAdminByIdRetOpt(adminVo.getAdmId());

        if(loadAdmin.isPresent()) {
            throw new Exception(StringUtils.message("이미 등록된 Admin({}) 입니다.", adminVo.getAdmId()));
        }

        AdminEntity newAdmin = new AdminEntity();
        adminMapper.updateFromVo(adminVo, newAdmin);

        return adminMapper.toVo(adminRepository.save(newAdmin));
    }

    public AdminVo update(AdminVo adminVo) throws Exception {

        Optional<AdminEntity> opt = findAdminByIdRetOpt(adminVo.getAdmId());
        AdminEntity loadAdmin = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Admin 정보({})가 없습니다.", adminVo.getAdmId())));

        adminMapper.updateFromVo(adminVo, loadAdmin);
        return adminMapper.toVo(adminRepository.save(loadAdmin));
    }
}
