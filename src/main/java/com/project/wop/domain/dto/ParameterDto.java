package com.project.wop.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ParameterDto extends AbstractDto {
    //private Long id;
    private String key;
    private String value;
}
