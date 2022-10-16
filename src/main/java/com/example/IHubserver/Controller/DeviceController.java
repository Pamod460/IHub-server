package com.example.IHubserver.Controller;

import com.example.IHubserver.Dao.DeviceDao;
import com.example.IHubserver.Dao.ItemDao;
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

    public List<DeviceDao> get() {

        return deviceService.getAll();
    }

    @GetMapping("devices/id/{deviceId}")

    public DeviceDao getById(@PathVariable String deviceId) {
        return deviceService.getById(deviceId);
    }


}
