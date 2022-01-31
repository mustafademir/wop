package com.project.wop.dao;

import com.project.wop.domain.entity.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterDaoJpa extends JpaRepository<Parameter, Long> {
}
