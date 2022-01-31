package com.project.wop.controller;

import com.project.wop.domain.entity.Parameter;
import com.project.wop.domain.dto.ParameterDto;
import com.project.wop.domain.mapper.ParameterMapper;
import com.project.wop.service.ParameterService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "parameter")
public class ParameterController {
    private final ParameterService parameterService;
    private final ParameterMapper parameterMapper;

    @PostMapping
    public ResponseEntity<Boolean> createParameter(@RequestBody ParameterDto parameterDto) {
        parameterService.addParameter(parameterMapper.parameterDtoToParameter(parameterDto));
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Parameter>> getParameters() {
        throw new DataIntegrityViolationException("dsf");
        //return ResponseEntity.ok(parameterService.getParameters());
    }
}
