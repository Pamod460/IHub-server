package com.example.IHubserver.Controller;


import com.example.IHubserver.Dao.ItemDao;
import com.example.IHubserver.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/item/")
@CrossOrigin

public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping("items")

    public List<ItemDao> get(){

        return itemService.getAll();
    }

}
