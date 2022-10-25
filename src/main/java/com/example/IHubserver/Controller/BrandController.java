package com.example.IHubserver.Controller;

import com.example.IHubserver.Entity.Brand;
import com.example.IHubserver.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ihub/server/")
@CrossOrigin

public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("brands")
    public List<Brand> get() {
        return brandService.getAll();
    }

    @GetMapping("brands/id/{brandId}")
    public Brand getById(@PathVariable String brandId) {
        return brandService.getById(brandId);
    }


}
