package com.example.IHubserver.Controller;

import com.example.IHubserver.Dao.BrandDao;
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

    public List<BrandDao> get(){
        return brandService.getAll();
    }

    @GetMapping("brands/id/{brandId}")

    public BrandDao getById(@PathVariable String brandId) {
        return brandService.getById(brandId);
    }


}
