package com.scottishpower.smartreaderservice.service.controller;

import com.scottishpower.smartreaderservice.repository.jpa.SmartReadRepository;
import com.scottishpower.smartreaderservice.repository.model.SmartReadCase;
import com.scottishpower.smartreaderservice.service.service.SmartReadService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SmartReaderControllerTest {
    private static final Integer ACCOUNT_NUMBER = 234;
    @Mock
    SmartReadRepository smartReadRepository;
    @Mock
    SmartReadService smartReadService;
    @InjectMocks
    private SmartReaderController testee;

    @Test
    @DisplayName("Get Smart Read successfully returns data for given account number")
    void getSmartRead() {
        var smartReadCase = SmartReadCase.builder().accountId(234L).build();
        initialiseSmartReadData(smartReadCase);
        when(testee.getSmartReadDetails(ACCOUNT_NUMBER)).thenReturn(Optional.ofNullable(smartReadCase));
        assertThat(testee.getSmartReadDetails(234).get().getAccountId().equals(234));
    }

    private void initialiseSmartReadData(SmartReadCase smartReadCase) {
        smartReadRepository.save(smartReadCase);
    }
}
