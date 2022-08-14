package com.scottishpower.smartreaderservice.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Data
@Builder
public class GasReading {
    private Integer id;
    private Integer meterId;
    private Integer reading;
    private ZonedDateTime date;
}
