package com.example.demo.domain.params;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceParams {
    private Integer value;
    private Timestamp timestamp;
    private String sensor;
}
