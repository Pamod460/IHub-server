package com.example.IHubserver.Service;

import com.example.IHubserver.Entity.Device;
import com.example.IHubserver.Dao.DeviceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DeviceService {
    @Autowired
    private DeviceDao devicedao;
    public List<Device> getAll(){
        List <Device> deviceList = devicedao.findAll();
        return deviceList;
    }

    public Device getById(String Id){
        Device device = devicedao.getById(Id);
        return device;
    }

}

