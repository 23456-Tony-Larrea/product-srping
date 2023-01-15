package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.InvoiceModels;
import com.example.demo.repositories.InvoiceRepository;

@Service
public class InvoiceService {
@Autowired 
InvoiceRepository invoiceRepository;
public ArrayList <InvoiceModels> getAllInvoices(){
return (ArrayList<InvoiceModels>) invoiceRepository.findAll();
}
public InvoiceModels saveInvoice(InvoiceModels invoice) {
return invoiceRepository.save(invoice);
}
public Optional <InvoiceModels> getInvoiceById(Long id) {
return invoiceRepository.findById(id);
}
public Boolean deleteInvoice(Long id) {
try {
invoiceRepository.deleteById(id);
return true;
} catch (Exception e) {
return false;
}
}
public Optional <InvoiceModels> updateInvoice(Long id) {
return invoiceRepository.findById(id);
}
}

