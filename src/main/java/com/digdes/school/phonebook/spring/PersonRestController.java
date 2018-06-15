package com.digdes.school.phonebook.spring;


import com.digdes.school.phonebook.model.Person;
import com.digdes.school.phonebook.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("spring/rest/person")
public class PersonRestController {


    @Autowired
    private PersonService personService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person get(@PathVariable("id") Long id) {
        return personService.get(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Person>> getAll() {
        return new ResponseEntity<>(personService.list(),  HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> add(@RequestBody Person person) {
        personService.add(person);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
