package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.ICategoryService;
import com.example.jazzy_kart.model.Category;
import com.example.jazzy_kart.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
//    @Autowired
//    private final CategoryRepository categoryRepository;

//    @Autowired
//    public CategoryService(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category updateCategory(Long id, Category categoryDetails){
        return categoryRepository.findById(id)
                .map(category -> {
                    category.setCategoryName(categoryDetails.getCategoryName());
                    category.setDescription(categoryDetails.getDescription());
                    return categoryRepository.save(category);
                })
                .orElse(null);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    // Additional business logic methods can be added here
}
