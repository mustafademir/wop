package com.project.wop.service;

import com.project.wop.dao.ParameterDaoJpa;
import com.project.wop.domain.entity.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParameterService {
    private final ParameterDaoJpa parameterDaoJpa;

    public Parameter addParameter(Parameter parameter) {
        return parameterDaoJpa.save(parameter);
    }

    public void deleteParameter(Long id) {
        parameterDaoJpa.deleteById(id);
    }

    public Parameter updateParameter(Parameter parameter) {
        return parameterDaoJpa.save(parameter);
    }

    public List<Parameter> getParameters() {
        return parameterDaoJpa.findAll();
    }
}
