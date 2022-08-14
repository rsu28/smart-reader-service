package com.scottishpower.smartreaderservice.repository.jpa;

import com.scottishpower.smartreaderservice.repository.model.SmartReadCase;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SmartReadRepository extends CrudRepository<SmartReadCase, Long> {

    Optional<SmartReadCase> findById(Long id);
}
