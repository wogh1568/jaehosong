package com.example.demo.dao;

import com.example.demo.domain.Device;
import com.example.demo.domain.params.DeviceParams;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceDao {

    List<Device> selectList(DeviceParams deviceParams);
}
