package com.bo.main.api.controller;

import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/bo/admin")
@RequiredArgsConstructor
public class BoAdminController {

    private final AdminService adminService;


    @GetMapping("/load/{adminId}")
    public ResponseEntity<?> A0103(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "adminId is required") @PathVariable(name = "adminId") String adminId
    ) {

        AdminVo adminVo = adminService.findAdminByIdRetNew(adminId);

        return new ResponseEntity<>(adminVo, HttpStatus.OK);
    }
}
