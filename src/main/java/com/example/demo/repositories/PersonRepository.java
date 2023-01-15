package com.example.demo.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.PersonModels;
public interface PersonRepository extends CrudRepository<PersonModels, Long> {
    PersonModels findById(long id);
}
