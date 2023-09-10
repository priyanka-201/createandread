package com.createRead.cr.Service;

import com.createRead.cr.Model.PersonEntity;
import com.createRead.cr.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public String createPerson(PersonEntity person){
        personRepository.save(person);
        return "Person records created with Id:"+person.getId();
    }
    public List<PersonEntity> getPersons(){
        return personRepository.findAll();
    }


}
