package com.example.demo.dao;

import com.example.demo.domain.Sensor;
import com.example.demo.domain.params.SensorParams;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SensorDao {

    List<Sensor> selectList(SensorParams sensorParams);

}
