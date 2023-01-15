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

import com.example.demo.models.InvoiceLineModels;
import com.example.demo.services.InvoiceLineService;

@RestController
@RequestMapping("/invoiceLine")
public class InvoiceLineController {
@Autowired
private InvoiceLineService invoiceLineService;
@GetMapping()
public ArrayList<InvoiceLineModels> getAllInvoiceLines(){
return invoiceLineService.getAllInvoiceLines();
}
@PostMapping()
public InvoiceLineModels saveInvoiceLine(@RequestBody InvoiceLineModels invoiceLine) {
return invoiceLineService.saveInvoiceLine(invoiceLine);
}
@GetMapping(path = "/{id}")
public Optional<InvoiceLineModels> getInvoiceLineById(@PathVariable("id") Long id) {
return invoiceLineService.getInvoiceLineById(id);
}
@DeleteMapping(path = "/{id}")
public Boolean deleteInvoiceLine(@PathVariable("id") Long id) {
return invoiceLineService.deleteInvoiceLine(id);
}
@PutMapping(path = "/{id}")
public InvoiceLineModels updateInvoiceLine(@RequestBody InvoiceLineModels invoiceLineModels, @PathVariable("id") Long id ) {
    invoiceLineModels.setId(id);
    return this.invoiceLineService.saveInvoiceLine(invoiceLineModels);
}

}
