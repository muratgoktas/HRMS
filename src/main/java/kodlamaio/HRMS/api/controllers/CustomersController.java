package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CustomerService;
import kodlamaio.HRMS.entities.concretes.Customer;

// Dış dünyanın sistemimizle ilişki kurdu yer. 
//andrioid, angller react tek çatı altında controller ile birleşir.

@RestController
@RequestMapping("/api/customers")
// kodlama.io/api/customers

public class CustomersController {

	private CustomerService customerService;

	@Autowired
	public CustomersController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	@GetMapping("/getall")
	public List<Customer> getAll() {
		return this.customerService.getAll();
	}
}
