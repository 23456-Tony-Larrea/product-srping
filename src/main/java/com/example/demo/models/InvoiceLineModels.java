package com.example.demo.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "invoiceLine")
public class InvoiceLineModels {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long Id;
 @ManyToOne
 private ProductsModels product;
 private BigDecimal quantity;
 private BigDecimal price;
}
