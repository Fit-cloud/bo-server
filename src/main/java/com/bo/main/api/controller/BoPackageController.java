package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqClassBaseVo;
import com.bo.main.api.controller.vo.req.ReqLecturerSearchVo;
import com.bo.main.api.entities.converts.LecturerMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.LecturerVo;
import com.bo.main.api.service.LecturerService;
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
@RequestMapping("/bo/package]")
@RequiredArgsConstructor
public class BoPackageController {

    private final LecturerService lecturerService;

    private final LecturerMapper lecturerMapper;

    @GetMapping("/management/{packCd}")
    public ResultResponse<?> searchAdmin(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "packCd is required") @PathVariable(name = "packCd") String packCd
    ) throws Exception {

        LecturerVo lecturerVo = lecturerService.findLecturerByIdRetError(packCd);

        return new ResultResponse<>(lecturerVo);
    }

    @GetMapping("/management/list")
    public ResultResponse<?> searchAdmins(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqLecturerSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqLecturerSearchVo.class);
        return new ResultResponse<>(lecturerService.search(searchVo, pageable));
    }

    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassBaseVo reqClassBaseVo
    ) throws Exception {

        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassBaseVo reqClassBaseVo
    ) throws Exception {


        return new ResultResponse<>(HttpStatus.CREATED);

    }
}


