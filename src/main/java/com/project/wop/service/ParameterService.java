package com.project.wop.service;

import com.project.wop.dao.ParameterDaoJpa;
import com.project.wop.domain.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParameterService {
    private final ParameterDaoJpa parameterDaoJpa;

    public void addParameter(Parameter parameter) {
        parameterDaoJpa.save(parameter);
    }

    public List<Parameter> getParameters() {
        return parameterDaoJpa.findAll();
    }
}
