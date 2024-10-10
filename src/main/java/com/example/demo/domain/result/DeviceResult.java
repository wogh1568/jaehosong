package com.example.demo.domain.result;

import com.example.demo.domain.Device;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class DeviceResult {
    private List<Device> devices;
}
