package com.scottishpower.smartreaderservice.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL_GASREADING")
public class GasReading {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "METERID")
    private Long meterId;

    @Column(name = "READ")
    private Long reading;

    @Column(name = "DATE")
    private ZonedDateTime date;
}
