package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.PersonModels;
import com.example.demo.repositories.PersonRepository;

@Service
public class PersonService {
@Autowired
PersonRepository personRepository;

public ArrayList<PersonModels> getAllPersons(){
return (ArrayList<PersonModels>) personRepository.findAll();
}
public PersonModels savePerson(PersonModels person) {
return personRepository.save(person);
}
public Optional<PersonModels> getPersonById(Long id) {
return personRepository.findById(id);
}
public Boolean deletePerson(Long id) {
try {
personRepository.deleteById(id);
return true;
} catch (Exception e) {
return false;
}
}
public Optional<PersonModels> updatePerson(Long id) {
return personRepository.findById(id);
}

}
