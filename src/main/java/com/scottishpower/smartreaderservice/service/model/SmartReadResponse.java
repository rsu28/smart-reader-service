package com.scottishpower.smartreaderservice.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class SmartReadResponse {
    private Long accountId;
    private List<GasReading> gasReadings;
    private List<ElecReading> elecReadings;
}
