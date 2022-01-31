package com.project.wop.domain.mapper;

import com.project.wop.domain.dto.ParameterDto;
import com.project.wop.domain.entity.Parameter;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParameterMapper {

    ParameterDto parameterToParameterDto(Parameter parameter);

    Parameter parameterDtoToParameter(ParameterDto parameterDto);
}
