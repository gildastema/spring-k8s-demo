package com.example.javaspringkubernetes;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @PostMapping("api/persons")
    public ResponseEntity<?> create(@Valid @RequestBody CreatePersonRequest createPersonRequest){
        Person person = Person.builder().email(createPersonRequest.getEmail())
                .name(createPersonRequest.getName())
                .build();
        personRepository.save(person);
        return  ResponseEntity.ok().build();
    }

    @GetMapping("api/persons")
    public List<PersonResponse> findAll(){

       return personRepository.findAll().stream()
               .map(person -> new PersonResponse(person.getName(), person.getEmail()))
               .collect(Collectors.toList());

    }

}
