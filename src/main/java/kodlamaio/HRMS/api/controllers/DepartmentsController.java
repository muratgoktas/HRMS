package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.DepartmentService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Department;
import lombok.AllArgsConstructor;

@RestController // Java olmayanlarda beni kullansın.
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentsController {
	
	private DepartmentService departmentService;
	
	@GetMapping("/getall")
	public DataResult<List<Department> > getAll() {
		return this.departmentService.getAll();
				
	}
	
	@PostMapping("/add")
	//@RequestBody Department dan türemiş bir department nesnesi oluşturuyor.
	public Result add(@RequestBody Department department) {
	
		return this.departmentService.add(department);
	}
}
