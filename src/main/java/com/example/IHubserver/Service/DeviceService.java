package com.example.IHubserver.Service;

import com.example.IHubserver.Entity.Device;
import com.example.IHubserver.Dao.DeviceDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DeviceService {

    @Autowired
    private DeviceDao devicedao;

    @Autowired
    private ModelMapper modelMapper;

    public List<Device> getAll(){
        List <Device> deviceList = devicedao.findAll();
        return modelMapper.map(deviceList,new TypeToken<List<Device>>() {}.getType());
    }

    public Device getById(String Id){
        Device device = devicedao.getById(Id);
        return  modelMapper.map(device, Device.class);
    }

}

