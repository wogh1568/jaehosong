package com.example.demo.service;

import com.example.demo.dao.SensorDao;
import com.example.demo.domain.Sensor;
import com.example.demo.domain.params.SensorParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    private SensorDao sensorDao;
    public List<Sensor> selectList(SensorParams sensorParams) {

        return sensorDao.selectList(sensorParams);


    }
}
