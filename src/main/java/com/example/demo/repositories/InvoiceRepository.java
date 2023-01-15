package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.InvoiceModels;

    public interface InvoiceRepository extends CrudRepository<InvoiceModels, Long> {
        InvoiceModels findById(long id);
    }
