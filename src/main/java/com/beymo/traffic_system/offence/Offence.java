package com.beymo.traffic_system.offence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Offence {
    private Long id;
    private String name;
    private String description;
}
