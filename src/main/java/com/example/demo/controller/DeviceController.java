package com.example.demo.controller;

import com.example.demo.domain.Device;
import com.example.demo.domain.params.DeviceParams;
import com.example.demo.domain.result.DeviceResult;
import com.example.demo.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public DeviceResult selectList(){
        DeviceParams deviceParams = DeviceParams.builder().build();
        List<Device> deviceList = deviceService.selectList(deviceParams);
        return DeviceResult.builder()
                .devices(deviceList)
                .build();
    }

}
