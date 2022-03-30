package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqAdminSearchVo;
import com.bo.main.api.controller.vo.req.ReqAdminVo;
import com.bo.main.api.entities.converts.AdminMapper;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.service.AdminService;
import com.bo.main.core.wapper.ResultResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

@RestController
@RequestMapping("/bo/admin")
@RequiredArgsConstructor
public class BoAdminController {

    private final AdminService adminService;

    private final AdminMapper adminMapper;

    @GetMapping("/management/{adminId}")
    public ResultResponse<?> searchAdmin(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "adminId is required") @PathVariable(name = "adminId") String adminId
    ) throws Exception {
        AdminVo adminVo = adminService.findAdminByIdRetError(adminId);
        return new ResultResponse<>(adminMapper.toVo(adminVo));
    }

    @GetMapping("/management/list")
    public ResultResponse<?> searchAdmins(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqAdminSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqAdminSearchVo.class);
        return new ResultResponse<>(adminService.search(searchVo, pageable));
    }

    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqAdminVo reqAdminVo
    ) throws Exception {

        AdminVo adminVo = adminMapper.toVo(reqAdminVo);
        adminService.add(adminVo);

        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqAdminVo reqAdminVo
    ) throws Exception {

        AdminVo adminVo = adminMapper.toVo(reqAdminVo);
        adminService.update(adminVo);

        return new ResultResponse<>(HttpStatus.CREATED);

    }
}


