package com.example.demo.controller;

import com.example.demo.domain.Sensor;
import com.example.demo.domain.params.SensorParams;
import com.example.demo.domain.result.SensorResult;
import com.example.demo.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sensor")
public class SensorController {

    @Autowired
    SensorService sensorService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public SensorResult selectList(){
        SensorParams sensorParams = SensorParams.builder().build();
        List<Sensor> sensorList = sensorService.selectList(sensorParams);
        return SensorResult.builder()
                .sensors(sensorList)
                .build();
    }




}
