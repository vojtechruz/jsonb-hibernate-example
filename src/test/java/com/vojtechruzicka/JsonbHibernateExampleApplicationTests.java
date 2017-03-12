package com.vojtechruzicka;

import com.vojtechruzicka.model.Person;
import com.vojtechruzicka.repositories.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonbHibernateExampleApplicationTests {

	@Autowired
	private PersonRepository repository;

	@Test
	public void contextLoads() {
		repository.deleteAll();

		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Doe");

		Map<String, String> additionalData = new HashMap<>();
		additionalData.put("favorite color", "red");
		additionalData.put("hair color", "brown");
		additionalData.put("eye color", "blue");
		person.setAdditionalData(additionalData);

		repository.save(person);
	}

}
