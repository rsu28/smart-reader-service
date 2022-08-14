package com.scottishpower.smartreaderservice.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TBL_SMARTREAD")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmartReadCase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long accountId;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<GasReading> gasReadings;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<ElecReading> elecReadings;
}
