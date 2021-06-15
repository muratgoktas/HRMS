package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.DepartmentService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.DepartmentDao;
import kodlamaio.HRMS.entities.concretes.Department;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class DepartmentManager implements DepartmentService {

	private DepartmentDao departmentDao;
	@Autowired
	
	@Override
	public DataResult<List<Department>>  getAll() {
		return new SuccessDataResult<List<Department>>(this.departmentDao.findAll(),"Data Listed!");
				
				
	}
	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccessResult("Deparment Added!");
	}

}
