package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.RoleService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.RoleDao;
import kodlamaio.HRMS.entities.concretes.Role;
import lombok.NoArgsConstructor;


@Service
@NoArgsConstructor

public class RoleManager implements RoleService {
	
	private RoleDao roleDao;
	
	@Autowired
	public RoleManager(RoleDao roleDao) {
		super();
		this.roleDao=roleDao;
	}
	
	@Override
	public DataResult<List<Role>> getAll() {
		return new SuccessDataResult<List<Role>>
		(this.roleDao.findAll(),"Role Listed!");
	}

	@Override
	public Result add(Role role) {
		this.roleDao.save(role);
		return new SuccessResult("Role Saved! Customer Added!");
	}

}
