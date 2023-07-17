package com.prakash.springdatajpa;

import com.prakash.springdatajpa.entities.Student;
import com.prakash.springdatajpa.repos.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	@Test
	void test()
	{
		Student student = Student.builder().id(1l).name("Prakash").testScore(100).build();
		repository.save(student);
		Student studentDb = repository.findById(1l).get();
		System.out.println("Student Object which is returned form DB : "+studentDb);
		Assertions.assertNotNull(studentDb);
	}

}
