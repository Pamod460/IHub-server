package com.example.IHubserver.Service;


import com.example.IHubserver.Entity.Item;
import com.example.IHubserver.Dao.ItemDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemService {

    @Autowired
    private ItemDao itemDao;


    public List<Item> getAll() {
        List<Item> itemList = itemDao.findAll();
        return itemList;

    }
    public Item getById(String Id) {
        Item item = itemDao.getById(Id);
        return item;
    }


}
