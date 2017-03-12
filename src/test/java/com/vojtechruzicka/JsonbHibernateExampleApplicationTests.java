package com.vojtechruzicka;

import com.vojtechruzicka.model.Person;
import com.vojtechruzicka.repositories.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonbHibernateExampleApplicationTests {

	@Autowired
	private PersonRepository repository;

	@Test
	public void contextLoads() {
		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Doe");
		repository.save(person);
	}

}
