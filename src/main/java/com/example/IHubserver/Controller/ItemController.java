package com.example.IHubserver.Controller;


import com.example.IHubserver.Dao.ItemDao;
import com.example.IHubserver.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ihub/server/")
@CrossOrigin

public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("items")

    public List<ItemDao> get() {

        return itemService.getAll();
    }

    @GetMapping("items/id/{itemId}")

    public ItemDao getById(@PathVariable String itemId) {
        return itemService.getById(itemId);
    }

}
