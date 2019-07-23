package net.ds5.digishop5.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ds5.digishop5.model.Customer;
import net.ds5.digishop5.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping("/save")
	public Customer saveCustomer() {
		Customer customer = new Customer("Sandeep Sharma", "sandeep@abc.com", 9876543210L);
		return customerRepository.save(customer);
	}
	
	 @RequestMapping("/api/helloworld")
	  public String findAll(){
	    return "Hello World!";
	  }

	@GetMapping("/saveAll")
	public Iterable<Customer> saveAllCustomer() {

		List<Customer> customers = Arrays.asList(new Customer("Gaurav Aggrawal", "gaurav@abc.com", 9876543210L),
				new Customer("Prince Kumar", "prince@abc.com", 988776554L),
				new Customer("Puneet Giri", "punit@abc.com", 123456789L),
				new Customer("Anand Sharma", "anand@abc.com", 3728728273L));

		return customerRepository.saveAll(customers);
	}

	@GetMapping("/findOne")
	public Optional<Customer> findCustomerById() {
		Integer id = 12151;
		return customerRepository.findById(id);
	}

	@GetMapping("/exist")
	public boolean isCustomerExist() {
		Integer id = 12151;
		return customerRepository.existsById(id);
	}

	@GetMapping("/all")
	public Iterable<Customer> allCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/allById")
	public Iterable<Customer> allCustomerById() {
		List<Integer> ids = Arrays.asList(12154, 12155);
		return customerRepository.findAllById(ids);
	}

	@GetMapping("/count")
	public long countCustomer() {
		return customerRepository.count();
	}

	@GetMapping("/deleteOne")
	public void deleteCustomerById() {
		Integer id = 12151;
		customerRepository.deleteById(id);
	}

	@GetMapping("/deleteCustomer")
	public void deleteCustomer() {
		Customer customer = new Customer(12153, "Prince Kumar", "prince@abc.com", 988776554L);
		customerRepository.delete(customer);
	}

	@GetMapping("/deleteCustomers")
	public void deleteCustomers() {

		List<Customer> customers = Arrays.asList(new Customer(12154, "Puneet Giri", "punit@abc.com", 123456789L),
				new Customer(12155, "Anand Sharma", "anand@abc.com", 3728728273L));

		customerRepository.deleteAll(customers);
	}

	@GetMapping("/deleteAll")
	public void deleteAllCustomers() {
		customerRepository.deleteAll();
	}
}
