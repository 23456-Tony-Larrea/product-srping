package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CategoryModels;
import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryService {
 @Autowired
 CategoryRepository categoryRepository;
 
 public ArrayList <CategoryModels> getAllCategories(){
    return (ArrayList<CategoryModels>) categoryRepository.findAll();
    }
    public CategoryModels saveCategory(CategoryModels category) {
    return categoryRepository.save(category);
    }
    public Optional <CategoryModels> getCategoryById(Long id) {
    return categoryRepository.findById(id);
    }
    public Boolean deleteCategory(Long id) {
    try {
    categoryRepository.deleteById(id);
    return true;
    } catch (Exception e) {
    return false;
    }
    }
    public Optional <CategoryModels> updateCategory(Long id) {
    return categoryRepository.findById(id);
    }
    }