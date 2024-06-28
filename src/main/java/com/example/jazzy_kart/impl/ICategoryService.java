package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Category;

import java.util.List;

public interface ICategoryService {

    Category saveCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    Category updateCategory(Long id, Category categoryDetails);

    void deleteCategory(Long id);
}
