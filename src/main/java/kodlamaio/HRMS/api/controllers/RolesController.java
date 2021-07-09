package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.RoleService;
import kodlamaio.HRMS.core.utilities.result.DataResult;
import kodlamaio.HRMS.core.utilities.result.Result;
import kodlamaio.HRMS.entities.concretes.Role;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/roles")
@NoArgsConstructor
public class RolesController {

	private RoleService roleService;
	
	@Autowired
	public RolesController(RoleService roleService) {
		super();
		this.roleService=roleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Role>> getAll() {
		return this.roleService.getAll();
	}

	@GetMapping("/add")
	public Result add(Role role) {
		return this.roleService.add(role);
	}

	
	
}
