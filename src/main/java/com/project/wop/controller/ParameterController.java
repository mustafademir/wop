package com.project.wop.controller;

import com.project.wop.domain.dto.ParameterDto;
import com.project.wop.domain.mapper.ParameterMapper;
import com.project.wop.service.ParameterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "parameter")
public class ParameterController {
    private final ParameterService parameterService;
    private final ParameterMapper parameterMapper;

    @PostMapping
    public ResponseEntity<ParameterDto> createParameter(@RequestBody ParameterDto parameterDto) {
        return ResponseEntity.ok(parameterMapper.parameterToParameterDto(parameterService.addParameter(parameterMapper.parameterDtoToParameter(parameterDto))));
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<ParameterDto>> getParameters() {
        return ResponseEntity.ok(parameterService.getParameters()
                .stream()
                .map(parameterMapper::parameterToParameterDto)
                .collect(Collectors.toList()));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteParameter(@PathVariable Long id) {
        parameterService.deleteParameter(id);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @PutMapping
    public ResponseEntity<ParameterDto> updateParameter(@RequestBody ParameterDto parameterDto) {
        return ResponseEntity.ok(parameterMapper.parameterToParameterDto(parameterService.updateParameter(parameterMapper.parameterDtoToParameter(parameterDto))));
    }
}
