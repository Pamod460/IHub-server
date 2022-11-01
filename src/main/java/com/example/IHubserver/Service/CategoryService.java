package com.example.IHubserver.Service;

import com.example.IHubserver.Entity.Category;
import com.example.IHubserver.Dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CategoryService {
    @Autowired
    private CategoryDao devicedao;
    public List<Category> getAll(){
        List <Category> categoryList = devicedao.findAll();
        return categoryList;
    }

    public Category getById(String Id){
        Category category = devicedao.getById(Id);
        return category;
    }

}

