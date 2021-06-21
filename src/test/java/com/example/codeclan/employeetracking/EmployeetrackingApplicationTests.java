package com.example.codeclan.employeetracking;

import com.example.codeclan.employeetracking.models.Employee;
import com.example.codeclan.employeetracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee(){
		Employee employee = new Employee("Gordon", 35, 73, "Gordon@codeclan.com");
		employeeRepository.save(employee);
	}

	@Test
	void createEmployee2(){
		Employee Holly = new Employee("Holly", 35, 73, "Gordon@codeclan.com");
		employeeRepository.save(Holly);
	}
}
