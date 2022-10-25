package com.example.IHubserver.Service;


import com.example.IHubserver.Dao.StorageDao;
import com.example.IHubserver.Entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StorageService {

    @Autowired
    private StorageDao storageDao;


    public List<Storage> getAll() {
        List<Storage> storageList = storageDao.findAll();
        return storageList;
    }

    public Storage getById(String storageId) {
        Storage storage = storageDao.getById(storageId);
        return storage;
    }

}
