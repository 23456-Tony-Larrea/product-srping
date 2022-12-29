package com.example.demo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.ProductsModels;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
@Autowired
ProductRepository productRepository;


public ArrayList<ProductsModels> getAllProducts(){
return (ArrayList<ProductsModels>) productRepository.findAll();
}


public ProductsModels saveProducts(ProductsModels product) {
return productRepository.save(product);
}

public Optional<ProductsModels> getProductById(Long id) {
return productRepository.findById(id);
}

public Boolean deleteProduct(Long id) {
try {
productRepository.deleteById(id);
return true;
} catch (Exception e) {
return false;
}    
}

public Optional<ProductsModels> updateProduct(Long id) {
return productRepository.findById(id);
}

}

