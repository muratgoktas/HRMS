package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// beans gördünüz mü o java classı demek
import kodlamaio.HRMS.business.abstracts.CustomerService;
import kodlamaio.HRMS.dataAccess.abstracts.CustomerDao;
import kodlamaio.HRMS.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService {
	
	private CustomerDao cutomerDao;

	@Autowired // CustoomerDao interface 
	// Spring elamında bu interface uygun bir class örneği instance yani
	// oluşturur. @Autowired bu işe yarar
	public CustomerManager(CustomerDao cutomerDao) {
		super();
		this.cutomerDao = cutomerDao;
	}

	@Override
	public List<Customer> getAll() {
		
		return this.cutomerDao.findAll();
	}
	
}
