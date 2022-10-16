package com.example.IHubserver.Service;

import com.example.IHubserver.Dao.MemoryDao;
import com.example.IHubserver.Entity.Memory;
import com.example.IHubserver.Repo.MemoryRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class MemoryService {

    @Autowired
    private MemoryRepo memoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<MemoryDao> getAll(){
        List<Memory> memoryList = memoryRepo.findAll();
        return modelMapper.map(memoryList,new TypeToken<List<MemoryDao>>(){}.getType());
    }

    public MemoryDao getById(String memoryId){
        Memory memory = memoryRepo.getById(memoryId);
        return  modelMapper.map(memory, MemoryDao.class);
    }

}
