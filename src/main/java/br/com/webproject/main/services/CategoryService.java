package br.com.webproject.main.services;

import br.com.webproject.main.entities.Category;
import br.com.webproject.main.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository category;

    public List<Category> findAll(){
        return category.findAll();
    }
    public Category findById(Long id){
        Optional<Category> obj =  category.findById(id);
        return obj.get();
    }
}
