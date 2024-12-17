package com.beymo.traffic_system.offence;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OffenceService {
    List<Offence> offences = new ArrayList<Offence>();
    void addOffence(){
        Offence offence  = Offence.builder()
                .id(1L)
                .name("Rovail")
                .description("Hoyo")
                .build();
        offences.add(offence);

    }
    List<Offence> getOffences(){
        return offences;
    }
}
