package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqAdminSearchVo;
import com.bo.main.api.controller.vo.req.ReqAdminVo;
import com.bo.main.api.controller.vo.req.ReqClassBaseVo;
import com.bo.main.api.entities.converts.AdminMapper;
import com.bo.main.api.entities.converts.ClassBaseMapper;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.service.AdminService;
import com.bo.main.api.service.ClassBaseService;
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
@RequestMapping("/bo/admin/classbase")
@RequiredArgsConstructor
public class BoClassController {

    private final ClassBaseService classBaseService;

    private final ClassBaseMapper classBaseMapper;

    @GetMapping("/{clssSeq}")
    public ResultResponse<?> searchAdmin(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "clssSeq is required") @PathVariable(name = "clssSeq") long clssSeq
    ) throws Exception {
        ClassBaseVo classBaseVo = classBaseService.findClassBaseByIdRetError(clssSeq);
        return new ResultResponse<>(classBaseMapper.toVo(classBaseVo));
    }
//
//    @GetMapping("/management/list")
//    public ResultResponse<?> searchAdmins(
//            HttpServletRequest req, HttpServletResponse resp,
//            @Valid @RequestParam Map<String, String> parameterMap,
//            @PageableDefault(page = 0, size = 10) Pageable pageable
//    ) throws Exception {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        ReqAdminSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqAdminSearchVo.class);
//        return new ResultResponse<>(adminService.search(searchVo, pageable));
//    }
//
    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassBaseVo reqClassBaseVo
    ) throws Exception {

        ClassBaseVo classBaseVo = classBaseMapper.toVo(reqClassBaseVo);
        classBaseService.add(classBaseVo);

        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassBaseVo reqClassBaseVo
    ) throws Exception {

        ClassBaseVo classBaseVo = classBaseMapper.toVo(reqClassBaseVo);
        classBaseService.update(classBaseVo);

        return new ResultResponse<>(HttpStatus.CREATED);

    }
}


