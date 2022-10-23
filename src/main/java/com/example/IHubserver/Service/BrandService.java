package com.example.IHubserver.Service;

import com.example.IHubserver.Dao.BrandDao;
import com.example.IHubserver.Entity.Brand;
import com.example.IHubserver.Repo.BrandRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BrandService {

    @Autowired
    private BrandRepo brandRepo;
    @Autowired
    private ModelMapper modelMapper;


    public List<BrandDao> getAll(){
        List<Brand> brandList = brandRepo.findAll();
        return modelMapper.map(brandList,new TypeToken<List<BrandDao>>(){}.getType());
    }

    public BrandDao getById(String brandId){
        Brand brand = brandRepo.getById(brandId);
        return  modelMapper.map(brand, BrandDao.class);
    }
}
