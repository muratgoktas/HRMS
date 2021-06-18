package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.entities.abstracts.User;


public interface UserService {
	DataResult<List<User>>   getAll();
}
