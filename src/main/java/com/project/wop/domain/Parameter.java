package com.project.wop.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Parameter {

    @Id
    private Long id;

    private String key;

    private String value;
}
