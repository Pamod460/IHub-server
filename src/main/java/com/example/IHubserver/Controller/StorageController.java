package com.example.IHubserver.Controller;


import com.example.IHubserver.Entity.Storage;
import com.example.IHubserver.Service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ihub/server/")
@CrossOrigin

public class StorageController {
    @Autowired
    private StorageService storageService;

    @GetMapping("storages")
    public List<Storage> get() {
        return storageService.getAll();
    }

    @GetMapping("storages/id/{storageId}")

    public Storage getById(@PathVariable String storageId) {
        return storageService.getById(storageId);
    }


}
