package com.project.wop.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AbstractDto {
    private Long id;
    private Date created;
    private Date updated;
}
