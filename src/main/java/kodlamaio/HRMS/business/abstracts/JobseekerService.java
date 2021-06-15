package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Jobseeker;

public interface JobseekerService {
	DataResult<List<Jobseeker>> getAll();
	Result add(Jobseeker jobseeker);
}
