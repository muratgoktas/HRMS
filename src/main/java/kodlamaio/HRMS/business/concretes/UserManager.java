package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.dataAccess.abstracts.UserDao;
import kodlamaio.HRMS.entities.abstracts.User;


@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"User Listed!");
				
				
	}

}
