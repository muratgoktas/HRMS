package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.UserDao;
import kodlamaio.HRMS.entities.concretes.User;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	
	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"User Listed!");
				
				
	}

}
