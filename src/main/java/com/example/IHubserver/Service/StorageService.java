package com.example.IHubserver.Service;

import com.example.IHubserver.Dao.StorageDao;
import com.example.IHubserver.Entity.Storage;
import com.example.IHubserver.Repo.StorageRepo;
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
    private StorageRepo storageRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<StorageDao> getAll(){
        List<Storage> storageList = storageRepo.findAll();
        return modelMapper.map(storageList,new TypeToken<List<StorageDao>>(){}.getType());
    }

    public StorageDao getById(String storageId){
        Storage storage = storageRepo.getById(storageId);
        return  modelMapper.map(storage, StorageDao.class);
    }
    
}
