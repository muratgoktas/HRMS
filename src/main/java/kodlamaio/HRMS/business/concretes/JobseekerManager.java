package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobseekerService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.core.utilities.result.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.result.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobseekerDao;
import kodlamaio.HRMS.entities.concretes.Jobseeker;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobseekerManager implements JobseekerService {

	private JobseekerDao jobseekerDao;

	@Override
	public DataResult<List<Jobseeker>> getAll() {

		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll(), "Data Listed");
	}

	@Override
	public Result add(Jobseeker jobseeker) {

		this.jobseekerDao.save(jobseeker);

		return new SuccessResult("Data Saved!");
	}

}
