package com.project.wop.controller;

import com.project.wop.domain.Parameter;
import com.project.wop.service.ParameterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "parameter")
public class ParameterController {
    private final ParameterService parameterService;

    @GetMapping
    public String createParameter() {
        Parameter parameter = new Parameter();
        parameter.setId(1L);
        parameter.setKey("deneme");
        parameter.setValue("val");
        parameterService.addParameter(parameter);
        return "sdf";
    }

    @GetMapping(value = "/all")
    public List<Parameter> getParameters() {
        return parameterService.getParameters();
    }
}
