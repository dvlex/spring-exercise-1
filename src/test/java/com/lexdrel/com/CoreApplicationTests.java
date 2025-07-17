package com.lexdrel.com;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lexdrel.com.entities.Student;
import com.lexdrel.com.repos.IStudentRepository;
import com.lexdrel.com.services.IPaymentService;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	IPaymentService paymentService;

	@Autowired
	private IStudentRepository studentRepository;

	@Test
	void testDependencyInjection() {
		assertNotNull(paymentService, "PaymentService should be injected");
	}

	@Test
	public void testSaveStudent() {
		// Create a new student entity
		Student student = new Student();
		student.setId(1L);
		student.setName("John Doe");
		student.setTestScore(85);

		// Save the student entity to the database
		studentRepository.save(student);

		// Retrieve the student entity from the database
		Student retrievedStudent = studentRepository.findById(1L).get();



		assertNotNull(retrievedStudent);

		
	}
}
