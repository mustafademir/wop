package com.project.wop.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Parameter {

    @Id
    @GeneratedValue
    private Long id;

    private String key;

    private String value;
}
