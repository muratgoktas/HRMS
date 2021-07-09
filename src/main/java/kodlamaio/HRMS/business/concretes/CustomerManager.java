package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CustomerService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CustomerDao;
import kodlamaio.HRMS.entities.concretes.Customer;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao=customerDao;
	}
	@Override
	public DataResult<List<Customer>> getAll() {
		return new SuccessDataResult<List<Customer>>
		(this.customerDao.findAll(),"Customer Listed!");
	}

	@Override
	public Result add(Customer customer) {
		this.customerDao.save(customer);
		return new SuccessResult("Customer Saved! Customer Added!");
	}

}
