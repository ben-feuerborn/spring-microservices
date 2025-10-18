package com.optimagrowth.license;

import com.optimagrowth.license.repository.PersonRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrintPeopleTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    void printAllPersons() {
        personRepository.findAll().forEach(person -> {
            System.out.println("Person: " + person.getName() +
            ", Major: " + person.getMajor() +
            ", Dept: " + person.getDept() +
            ", DOB: " + person.getDateOfBirth() +
            ", Phone: " + person.getPhone() +
            ", Email: " + person.getEmail());
        });
    }
}
