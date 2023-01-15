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

import com.example.demo.models.PersonModels;
import com.example.demo.services.PersonService;

@RestController
@RequestMapping("/persons")

public class PersonController {
@Autowired
PersonService personService;
@GetMapping()
public ArrayList<PersonModels> getAllPersons(){
return personService.getAllPersons();
}
@PostMapping()
public PersonModels savePerson(@RequestBody PersonModels person) {
return personService.savePerson(person);
}
@GetMapping(path = "/{id}")
public Optional<PersonModels> getPersonById(@PathVariable("id") Long id) {
return personService.getPersonById(id);
}
@DeleteMapping(path = "/{id}")
public Boolean deletePerson(@PathVariable("id") Long id) {
return personService.deletePerson(id);
}
@PutMapping(path = "/{id}")
public PersonModels updatePerson(@RequestBody PersonModels personModels, @PathVariable("id") Long id ) {
    personModels.setId(id);
    return this.personService.savePerson(personModels);
}

}
