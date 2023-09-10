package com.createRead.cr.Controller;

import com.createRead.cr.Model.PersonEntity;

import com.createRead.cr.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private PersonService personService;
@PostMapping("/person")
    public String createPerson(@RequestBody PersonEntity person){
        personService.createPerson(person);
        return "Person records created with Id:"+person.getId();
    }
    @GetMapping("/person")
    public List<PersonEntity> getPersons(){
        return personService.getPersons();
    }
}
