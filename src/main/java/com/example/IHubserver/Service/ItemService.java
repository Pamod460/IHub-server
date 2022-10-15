package com.example.IHubserver.Service;

import com.example.IHubserver.Dao.ItemDao;
import com.example.IHubserver.Entity.Item;
import com.example.IHubserver.Repo.ItemRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ModelMapper modelMapper;


    public List <ItemDao> getAll(){
        List<Item> itemList = itemRepo.findAll();
        return modelMapper.map(itemList, new TypeToken<List<ItemDao>>() {}.getType());

    }
}
