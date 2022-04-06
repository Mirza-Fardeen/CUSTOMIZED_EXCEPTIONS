package semantic.com.example.semantic_web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import semantic.com.example.semantic_web.emp.EmployeeRepository;
import semantic.com.example.semantic_web.emp.FullTimeEmployee;
import semantic.com.example.semantic_web.emp.PartTimeEmployee;

import java.math.BigDecimal;

@SpringBootApplication
public class SemanticWebApplication implements CommandLineRunner{

	@Autowired
	private static EmployeeRepository employeeRepository;





	public static void main(String[] args) {
		SpringApplication.run(SemanticWebApplication.class, args);
//		employeeRepository.insert(new PartTimeEmployee("Jill", new BigDecimal(500)));
//		employeeRepository.insert(new FullTimeEmployee("Jack", new BigDecimal(6000)));



	//	System.out.println(" \n \n  \n "+employeeRepository.getEmployees());

	}


	@Override
	public void run(String... args) throws Exception {

	}
}
