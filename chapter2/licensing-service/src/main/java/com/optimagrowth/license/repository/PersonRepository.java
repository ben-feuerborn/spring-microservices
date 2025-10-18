package com.optimagrowth.license.repository;

import com.optimagrowth.license.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
