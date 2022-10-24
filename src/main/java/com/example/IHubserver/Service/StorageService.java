package com.example.IHubserver.Service;


import com.example.IHubserver.Entity.Storage;
import com.example.IHubserver.Dao.StorageDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StorageService {

    @Autowired
    private StorageDao storageDao;
    @Autowired
    private ModelMapper modelMapper;

    public List<Storage> getAll(){
        List<Storage> storageList = storageDao.findAll();
        return modelMapper.map(storageList,new TypeToken<List<Storage>>(){}.getType());
    }

    public Storage getById(String storageId){
        Storage storage = storageDao.getById(storageId);
        return  modelMapper.map(storage, Storage.class);
    }
    
}
