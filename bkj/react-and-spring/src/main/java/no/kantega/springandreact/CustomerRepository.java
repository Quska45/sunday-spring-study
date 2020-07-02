package no.kantega.springandreact;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

//예제용
public interface CustomerRepository extends MongoRepository<Customer, String> {

  public Customer findByFirstName(String firstName);
  public List<Customer> findByLastName(String lastName);
  
}