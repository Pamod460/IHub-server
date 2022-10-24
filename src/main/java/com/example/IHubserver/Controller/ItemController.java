package com.example.IHubserver.Controller;



import com.example.IHubserver.Entity.Item;
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

    public List<Item> get() {

        return itemService.getAll();
    }

    @GetMapping("items/id/{itemId}")

    public Item getById(@PathVariable String itemId) {
        return itemService.getById(itemId);
    }

}
