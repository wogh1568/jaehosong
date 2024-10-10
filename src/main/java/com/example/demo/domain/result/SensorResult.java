package com.example.demo.domain.result;

import com.example.demo.domain.Sensor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class SensorResult {

    private List<Sensor> sensors;

}
