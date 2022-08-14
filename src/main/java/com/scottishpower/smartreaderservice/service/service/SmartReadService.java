package com.scottishpower.smartreaderservice.service.service;

import com.scottishpower.smartreaderservice.repository.jpa.SmartReadRepository;
import com.scottishpower.smartreaderservice.repository.model.SmartReadCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartReadService {

    @Autowired
    private SmartReadRepository smartReadRepository;

    public Optional<SmartReadCase> getSmartRead(Long accountNumber) {
        Optional<SmartReadCase> smartReadCase = smartReadRepository.findById(accountNumber);
        return smartReadCase;
    }

    public void saveSmartRead(SmartReadCase smartReadCaseRequest) {
        smartReadRepository.save(smartReadCaseRequest);
    }
}
