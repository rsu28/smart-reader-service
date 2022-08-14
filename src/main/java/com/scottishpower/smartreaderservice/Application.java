package com.scottishpower.smartreaderservice;

import com.scottishpower.smartreaderservice.repository.jpa.SmartReadRepository;
import com.scottishpower.smartreaderservice.repository.model.ElecReading;
import com.scottishpower.smartreaderservice.repository.model.GasReading;
import com.scottishpower.smartreaderservice.repository.model.SmartReadCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.ZonedDateTime;
import java.util.List;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //TODO remove me
    @Bean
    public CommandLineRunner initiateSmartReadCase(SmartReadRepository repository) {
        return (args) -> {
            // save a smartReadCase to demo
            var gasReading = GasReading.builder().meterId(1L).reading(13L).date(ZonedDateTime.parse("2018-03-23T15:00:00Z")).build();
            List<GasReading> gasReadingList = List.of(gasReading);
            var elecReading = ElecReading.builder().meterId(1L).reading(13L).date(ZonedDateTime.parse("2018-03-23T15:00:00Z")).build();
            List<ElecReading> elecReadingList = List.of(elecReading);
            repository.save(new SmartReadCase(1L, gasReadingList, elecReadingList));
        };
    }

}
