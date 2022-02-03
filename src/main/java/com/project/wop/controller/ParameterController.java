package com.project.wop.controller;

import com.project.wop.domain.dto.ParameterDto;
import com.project.wop.service.ParameterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "parameter")
public class ParameterController {
    private final ParameterService parameterService;

    @PostMapping
    public ResponseEntity<ParameterDto> createParameter(@RequestBody ParameterDto parameterDto) {
        return ResponseEntity.ok(parameterService.addParameter(parameterDto));
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<ParameterDto>> getParameters() {
        return ResponseEntity.ok(parameterService.getParameters());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteParameter(@PathVariable Long id) {
        return ResponseEntity.ok(parameterService.deleteParameter(id));
    }

    @PutMapping
    public ResponseEntity<ParameterDto> updateParameter(@RequestBody ParameterDto parameterDto) {
        return ResponseEntity.ok(parameterService.updateParameter(parameterDto));
    }
}
