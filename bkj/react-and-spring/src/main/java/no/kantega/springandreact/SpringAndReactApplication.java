package no.kantega.springandreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import no.kantega.springandreact.repository.ContentRepository;

@SpringBootApplication
public class SpringAndReactApplication {

	//예제용
//	@Autowired
//	private CustomerRepository customRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAndReactApplication.class, args);
	}

	//예제용
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		customRepository.deleteAll();
//
//	    // save a couple of customers
//		customRepository.save(new Customer("Alice", "Smith"));
//		customRepository.save(new Customer("Bob", "Smith"));
//
//	    // fetch all customers
//	    System.out.println("Customers found with findAll():");
//	    System.out.println("-------------------------------");
//	    for (Customer customer : customRepository.findAll()) {
//	      System.out.println(customer);
//	    }
//	    System.out.println();
//
//	    // fetch an individual customer
//	    System.out.println("Customer found with findByFirstName('Alice'):");
//	    System.out.println("--------------------------------");
//	    System.out.println(customRepository.findByFirstName("Alice"));
//
//	    System.out.println("Customers found with findByLastName('Smith'):");
//	    System.out.println("--------------------------------");
//	    for (Customer customer : customRepository.findByLastName("Smith")) {
//	      System.out.println(customer);
//	    }
//	}
	
}
