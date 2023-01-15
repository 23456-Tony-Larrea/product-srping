package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CategoryModels;
import com.example.demo.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
@Autowired
CategoryService categoryService;
@GetMapping()
public ArrayList<CategoryModels> getAllCategories(){
return categoryService.getAllCategories();
}
@PostMapping()
public CategoryModels saveCategory(@RequestBody CategoryModels category) {
return categoryService.saveCategory(category);
}
@GetMapping(path = "/{id}")
public Optional<CategoryModels> getCategoryById(@PathVariable("id") Long id) {
return categoryService.getCategoryById(id);
}
@DeleteMapping(path = "/{id}")
public Boolean deleteCategory(@PathVariable("id") Long id) {
return categoryService.deleteCategory(id);
}
@PutMapping(path = "/{id}")
public CategoryModels updateCategory(@RequestBody CategoryModels categoryModels, @PathVariable("id") Long id ) {
    categoryModels.setId(id);
    return this.categoryService.saveCategory(categoryModels);
}

}
