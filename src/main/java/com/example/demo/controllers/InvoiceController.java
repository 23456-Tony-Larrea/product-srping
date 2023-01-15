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

import com.example.demo.models.InvoiceModels;
import com.example.demo.services.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
@Autowired
private InvoiceService invoiceService;
@GetMapping()
public ArrayList<InvoiceModels> getAllInvoices(){
return invoiceService.getAllInvoices();
}
@PostMapping()
public InvoiceModels saveInvoice(@RequestBody InvoiceModels invoice) {
return invoiceService.saveInvoice(invoice);
}
@GetMapping(path = "/{id}")
public Optional<InvoiceModels> getInvoiceById(@PathVariable("id") Long id) {
return invoiceService.getInvoiceById(id);
}
@DeleteMapping(path = "/{id}")
public Boolean deleteInvoice(@PathVariable("id") Long id) {
return invoiceService.deleteInvoice(id);
}
@PutMapping(path = "/{id}")
public InvoiceModels updateInvoice(@RequestBody InvoiceModels invoiceModels, @PathVariable("id") Long id ) {
    invoiceModels.setId(id);
    return this.invoiceService.saveInvoice(invoiceModels);
}

}
