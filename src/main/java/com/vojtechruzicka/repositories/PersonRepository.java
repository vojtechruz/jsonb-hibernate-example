package com.vojtechruzicka.repositories;

import com.vojtechruzicka.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
