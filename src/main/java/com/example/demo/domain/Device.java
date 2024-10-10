package com.example.demo.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Device {
    private Integer value;
    private Timestamp timestamp;
    private String sensor;
}
