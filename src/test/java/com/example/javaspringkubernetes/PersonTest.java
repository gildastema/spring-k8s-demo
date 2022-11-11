package com.example.javaspringkubernetes;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest extends AbstractIntegrationTest {
    @Autowired
    private PersonRepository personRepository;
    @Test
    public void createOk(){
        String email = "gildastema@yahoo.fr";
        String name = "Gildas Tema";
        ResponseEntity<Void> response = postJson("/api/persons", new CreatePersonRequest(email, name), Void.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Optional<Person> person = personRepository.findById(1);
        assertThat(person.isPresent()).isTrue();
    }
}
