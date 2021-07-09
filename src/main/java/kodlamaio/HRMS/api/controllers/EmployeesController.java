package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.EmployeeService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
@NoArgsConstructor

public class EmployeesController {

	private EmployeeService employeeService;
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Employee employee) {
		return employeeService.add(employee);
	}
	
	@PostMapping("/delete")
	public Result delete(Employee employee) {
		return employeeService.delete(employee);
	}
}
