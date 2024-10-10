package com.example.demo.service;

import com.example.demo.dao.DeviceDao;
import com.example.demo.domain.Device;
import com.example.demo.domain.params.DeviceParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private DeviceDao deviceDao;

    public List<Device> selectList(DeviceParams deviceParams) {
        return deviceDao.selectList(deviceParams);
    }
}
