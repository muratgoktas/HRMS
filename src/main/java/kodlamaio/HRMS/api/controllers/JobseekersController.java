package kodlamaio.HRMS.api.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobseekerService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Jobseeker;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/jobseekers")
@AllArgsConstructor
public class JobseekersController {

	private JobseekerService jobseekerService;

	@GetMapping("/getall")
	public DataResult<List<Jobseeker>> getAll() {
		return this.jobseekerService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Jobseeker jobseeker) {
		return this.jobseekerService.add(jobseeker);
	}

}
