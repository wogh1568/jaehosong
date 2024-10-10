package com.example.demo.domain.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SensorParams {

    private String fireSensor;
    private String pumpSensor;
    private String waterSensor;
    private String viSensor;
    private String state;

}
