package com.example.demo.controllers;
import com.example.demo.models.ProductsModels;
import com.example.demo.services.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/products")
public class ProductContoller {
@Autowired
ProductService productService;
@GetMapping()
public ArrayList<ProductsModels> getAllProducts(){
return productService.getAllProducts();
}
@PostMapping()
public ProductsModels saveProducts(@RequestBody ProductsModels product) {
return productService.saveProducts(product);
}
@GetMapping(path = "/{id}")
public Optional<ProductsModels> getProductById(@PathVariable("id") Long id) {
return productService.getProductById(id);
}
@DeleteMapping(path = "/{id}")
public Boolean deleteProduct(@PathVariable("id") Long id) {
return productService.deleteProduct(id);
}
@PutMapping(path = "/{id}")
public ProductsModels updateProduct(@RequestBody ProductsModels productsModels, @PathVariable("id") Long id ) {
    productsModels.setId(id);
    return this.productService.saveProducts(productsModels);
}

}   

