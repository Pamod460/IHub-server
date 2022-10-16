package com.example.IHubserver.Service;

import com.example.IHubserver.Dao.DeviceDao;
import com.example.IHubserver.Dao.ItemDao;
import com.example.IHubserver.Entity.Device;
import com.example.IHubserver.Entity.Item;
import com.example.IHubserver.Repo.DeviceRepo;
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
    private DeviceRepo deviceRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<DeviceDao> getAll(){
        List <Device> deviceList = deviceRepo.findAll();
        return modelMapper.map(deviceList,new TypeToken<List<DeviceDao>>() {}.getType());
    }

    public DeviceDao getById(String Id){
        Device device = deviceRepo.getById(Id);
        return  modelMapper.map(device, DeviceDao.class);
    }

}

