package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.ProductsModels;

public interface ProductRepository extends CrudRepository<ProductsModels, Long> {
ProductsModels findById(long id);
}
