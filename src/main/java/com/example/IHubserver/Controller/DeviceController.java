package com.example.IHubserver.Controller;

import com.example.IHubserver.Entity.Device;
import com.example.IHubserver.Service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ihub/server/")
@CrossOrigin

public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("devices")

    public List<Device> get() {

        return deviceService.getAll();
    }

    @GetMapping("devices/id/{deviceId}")

    public Device getById(@PathVariable String deviceId) {
        return deviceService.getById(deviceId);
    }


}
