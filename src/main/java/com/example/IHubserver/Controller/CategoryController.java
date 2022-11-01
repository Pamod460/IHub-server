package com.example.IHubserver.Controller;

import com.example.IHubserver.Entity.Category;
import com.example.IHubserver.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ihub/server/")
@CrossOrigin

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("devices")
    public List<Category> get() {
        return categoryService.getAll();
    }

    @GetMapping("devices/id/{deviceId}")
    public Category getById(@PathVariable String deviceId) {
        return categoryService.getById(deviceId);
    }

}
