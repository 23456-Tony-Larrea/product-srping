package com.example.demo.models;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Data
@Entity
@Table(name = "products")
public class ProductsModels {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String typeProduct ;
    @ManyToOne
    private CategoryModels categoryModels;
}
