package com.example.IHubserver.Service;

import com.example.IHubserver.Entity.Brand;
import com.example.IHubserver.Dao.BrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BrandService {

    @Autowired
    private BrandDao brandDao;

    public List<Brand> getAll(){
        List<Brand> brandList = brandDao.findAll();
        return brandList;
    }

    public Brand getById(String brandId){
        Brand brand = brandDao.getById(brandId);
        return  brand;
    }
}
