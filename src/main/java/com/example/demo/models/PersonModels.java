package com.example.demo.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "people")
public class PersonModels {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String person;
private String typeContributor;
private String TypeIdentification;
}
