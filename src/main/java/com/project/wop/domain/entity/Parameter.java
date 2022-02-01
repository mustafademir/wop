package com.project.wop.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Parameter extends AbstractEntity {

    @Column
    private String key;

    @Column
    private String value;
}
