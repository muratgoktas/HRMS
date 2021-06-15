package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Department;

public interface DepartmentService  {
	DataResult<List<Department>>  getAll();
	Result add(Department department);
}
