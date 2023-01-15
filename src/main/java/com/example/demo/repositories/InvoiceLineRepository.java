package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.InvoiceLineModels;

public interface InvoiceLineRepository extends CrudRepository<InvoiceLineModels, Long>{
    InvoiceLineModels findById(long id);
}
