package com.beymo.traffic_system.offence;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class OffenceController {
    private OffenceService offenceService;
    @PostMapping
    public void addOffences(){
        offenceService.addOffence();
    }

    @GetMapping
    public List<Offence> getOffences(){
        return offenceService.getOffences();
    }
}
