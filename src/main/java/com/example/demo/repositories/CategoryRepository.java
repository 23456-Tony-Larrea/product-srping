package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.CategoryModels;
public interface CategoryRepository extends CrudRepository<CategoryModels, Long> {
CategoryModels findById(long id);
}