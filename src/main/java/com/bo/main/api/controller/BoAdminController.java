package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqAdminVo;
import com.bo.main.api.entities.converts.AdminMapper;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.service.AdminService;
import com.bo.main.core.wapper.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
            @Valid @RequestBody ReqAdminVo reqAdminVo
    ) throws Exception {
        return new ResultResponse<>(adminMapper.toVo(adminMapper.toVo(reqAdminVo)));
    }

    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqAdminVo reqAdminVo
    ) throws Exception {
        AdminVo adminVo = adminMapper.toVo(reqAdminVo);
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqAdminVo reqAdminVo
    ) throws Exception {
        AdminVo adminVo = adminMapper.toVo(reqAdminVo);
        return new ResultResponse<>(HttpStatus.CREATED);

    }
}


