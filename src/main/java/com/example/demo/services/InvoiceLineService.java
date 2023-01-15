package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.InvoiceLineModels;
import com.example.demo.repositories.InvoiceLineRepository;

@Service
public class InvoiceLineService {
@Autowired
InvoiceLineRepository invoiceLineRepository;


public ArrayList<InvoiceLineModels> getAllInvoiceLines(){
return (ArrayList<InvoiceLineModels>) invoiceLineRepository.findAll();
}

public InvoiceLineModels saveInvoiceLine(InvoiceLineModels invoiceLine) {
return invoiceLineRepository.save(invoiceLine);
}

public Optional<InvoiceLineModels> getInvoiceLineById(Long id) {
return invoiceLineRepository.findById(id);
}
public Boolean deleteInvoiceLine(Long id) {
try {
invoiceLineRepository.deleteById(id);
return true;
} catch (Exception e) {
return false;
}    
}
public Optional<InvoiceLineModels> updateInvoiceLine(Long id) {
return invoiceLineRepository.findById(id);
}

}
