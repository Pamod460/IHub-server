package com.example.IHubserver.Service;

import com.example.IHubserver.Entity.Memory;
import com.example.IHubserver.Dao.MemoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class MemoryService {

    @Autowired
    private MemoryDao memoryDao;


    public List<Memory> getAll(){
        List<Memory> memoryList = memoryDao.findAll();
        return memoryList;
    }

    public Memory getById(String memoryId){
        Memory memory = memoryDao.getById(memoryId);
        return  memory;
    }

}
