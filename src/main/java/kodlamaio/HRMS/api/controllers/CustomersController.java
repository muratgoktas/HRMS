package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.CustomerService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Customer;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/customers")
@NoArgsConstructor

public class CustomersController {
	private CustomerService customerService;

	@Autowired
	public CustomersController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/getall")
	public DataResult<List<Customer>> getAll() {
		return this.customerService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Customer customer) {

		return this.customerService.add(customer);
	}

}
