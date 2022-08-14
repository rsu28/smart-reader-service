package com.scottishpower.smartreaderservice.service.controller;

import com.scottishpower.smartreaderservice.repository.model.SmartReadCase;
import com.scottishpower.smartreaderservice.service.service.SmartReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/smart")
@Component
@RequiredArgsConstructor
public class SmartReaderController {
    @Autowired
    private SmartReadService smartReadService;

    @GetMapping("/reads/{accountNumber}")
    public Optional<SmartReadCase> getSmartReadDetails(@PathVariable(name = "accountNumber") Integer accountNumber) {
        //TODO future development to create a mapper class that returns a response class instead of the entity model
        return smartReadService.getSmartRead(Long.valueOf(accountNumber));
    }

//    @PostMapping("/reads")
//    public void createSmartReadDetails(@RequestBody SmartReadCaseRequest smartReadCaseRequest) {
//        smartReadService.saveSmartRead(smartReadCaseRequest);
//    }
}
