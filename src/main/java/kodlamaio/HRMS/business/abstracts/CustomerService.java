package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.Customer;

public interface CustomerService {
	List<Customer> getAll();

}
