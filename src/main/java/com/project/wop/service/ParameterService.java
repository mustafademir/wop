package com.project.wop.service;

import com.project.wop.dao.ParameterDaoJpa;
import com.project.wop.domain.dto.ParameterDto;
import com.project.wop.domain.entity.Parameter;
import com.project.wop.domain.mapper.ParameterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ParameterService {
    private final ParameterDaoJpa parameterDaoJpa;
    private final ParameterMapper parameterMapper;

    public ParameterDto addParameter(ParameterDto parameterDto) {
        return parameterMapper.parameterToParameterDto(parameterDaoJpa.save(parameterMapper.parameterDtoToParameter(parameterDto)));
    }

    public Boolean deleteParameter(Long id) {
        parameterDaoJpa.deleteById(id);
        return Boolean.TRUE;
    }

    public ParameterDto updateParameter(ParameterDto parameterDto) {
        return parameterMapper.parameterToParameterDto(parameterDaoJpa.save(parameterMapper.parameterDtoToParameter(parameterDto)));
    }

    public List<ParameterDto> getParameters() {
        final List<Parameter> parameters = parameterDaoJpa.findAll();
        return parameters
                .stream()
                .map(parameterMapper::parameterToParameterDto)
                .collect(Collectors.toList());
    }
}
