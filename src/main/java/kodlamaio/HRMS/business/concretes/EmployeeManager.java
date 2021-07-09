package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.EmployeeService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HRMS.entities.concretes.Employee;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.findAll(),"Employee Listed!");
	}

	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Employee Added!");
	}

	@Override
	public Result delete(Employee employee) {
		this.employeeDao.delete(employee);
		return new SuccessResult("Employe Deleted!");
	}

}
