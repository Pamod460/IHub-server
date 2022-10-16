package com.example.IHubserver.Controller;

import com.example.IHubserver.Dao.MemoryDao;
import com.example.IHubserver.Dao.MemoryDao;
import com.example.IHubserver.Service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ihub/server/")
@CrossOrigin
public class MemoryController {

    @Autowired
    private MemoryService memoryService;

    @GetMapping("memories")

    public List<MemoryDao> get() {
        return memoryService.getAll();
    }

    @GetMapping("memories/id/{memoryId}")

    public MemoryDao getById(@PathVariable String memoryId) {
        return memoryService.getById(memoryId);
    }


}
